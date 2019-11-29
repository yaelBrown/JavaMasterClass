package com.squarehelp.squarehelp.controllers;

import com.squarehelp.squarehelp.models.*;
import com.squarehelp.squarehelp.repositories.MessagesRepository;
import com.squarehelp.squarehelp.repositories.NotificationRepository;
import com.squarehelp.squarehelp.repositories.SmokerInfoRepository;
import com.squarehelp.squarehelp.repositories.UserRepository;
import com.squarehelp.squarehelp.services.NotificationServices;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MessageController {
    private final MessagesRepository messageDao;
    private final UserRepository userDao;
    private final SmokerInfoRepository smokeDao;
    private final NotificationServices notiServices;
    private final NotificationRepository notiDao;

    public MessageController(MessagesRepository messageDao, UserRepository userDao, SmokerInfoRepository smokeDao, NotificationServices notiServices, NotificationRepository notiDao){
        this.messageDao = messageDao;
        this.userDao = userDao;
        this.smokeDao = smokeDao;
        this.notiServices = notiServices;
        this.notiDao = notiDao;
    }

    // View all messages and shows unique authors
    @GetMapping("/message")
    public String getSendMessageView(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();

        // Get all messages from for current user and add unique messages to another list and pass it to the view.
        List<Messages> uni = messageDao.findDistinctByRecipient_user_idOrAuthor_user_id(id);
        ArrayList<Messages> unique = new ArrayList<>();

        if (uni.size() > 0) {
            unique.add(uni.get(0));

            for (int j = 0; j < uni.size(); j++) {
                for (int i = 0; i < unique.size(); i++) {
//                    if (!uni.get(j).getRecipient_username().equalsIgnoreCase(unique.get(i).getRecipient_username())) unique.add(uni.get(j));
                    if (uni.get(j).getRecipient_user_id() != unique.get(i).getRecipient_user_id()) unique.add(uni.get(j));
                }
            }
        }

        model.addAttribute("uniqueMsgs", unique);

        model.addAttribute("smoke", smokeDao.getOne(id));
        model.addAttribute("users", userDao.getOne(id));

        return "message-view-all";
    }


    // View an conversation with one person
    @GetMapping("/message/view/{rId}")
    public String getSingleMessageView(Model model, @PathVariable long rId) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();

        List<Messages> m = messageDao.findDistinctByRecipient_user_idOrAuthor_user_id(rId);

        // Filter this logged in user and specified recipient conversation only
        ArrayList<Messages> conversation = new ArrayList<Messages>();

        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getRecipient_user_id() == rId && m.get(i).getAuthor_user_id() == user.getId()) {
                conversation.add(m.get(i));
            } else if (m.get(i).getRecipient_user_id() == user.getId() && m.get(i).getAuthor_user_id() == rId) {
                conversation.add(m.get(i));
            }
        }

        System.out.println("conversation = " + conversation);

        model.addAttribute("conversation", conversation);
        model.addAttribute("recip", userDao.getOne(rId));
        model.addAttribute("msgs", m);

        model.addAttribute("smoke", smokeDao.getOne(id));
        model.addAttribute("users", user);

        return "message-view-one";
    }

    // View form to find user to create a new message
    @GetMapping("/message/create")
    public String getFindRecipPage(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();

        model.addAttribute("smoke", smokeDao.getOne(id));
        model.addAttribute("users", userDao.getOne(id));

        return "message-create";
    }

    // Form to actually compose message and send it
    @GetMapping("/message/{rId}/send")
    public String sendMessage(Model model, @PathVariable long rId) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();

        model.addAttribute("smoke", smokeDao.getOne(id));
        model.addAttribute("users", userDao.getOne(id));
        model.addAttribute("recipient", userDao.getOne(rId));

        return "sendMessage";
    }

    // Save new messages from the form to database
    @PostMapping("/message/{rId}/send")
    public String SaveMessage( @PathVariable long rId, @RequestParam String message) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();

        // get recip's username
        User recip = userDao.findUserById(rId);
        String recipUsername = recip.getUsername();

        // Create a new date object to update last_updated
        java.util.Date now = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(now.getTime());

        messageDao.save(new Messages((int) id,(int) rId, message, user, recipUsername, sqlDate));
        notiServices.createNotification(user.getUsername(), rId, "msg");

        return "redirect:/message";
    }

//    @PostMapping("/messagechat/{oId}")
//    public String getMessageChat(Model model, @PathVariable long oId){
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        long id = user.getId();
//        Long notification = notiDao.findNotificationsByOriginator_user_idIs(oId);
//        User recip =  userDao.getOne(notification);
//        SmokerInfo smokerInfo = smokeDao.getOne(id);
//        model.addAttribute("users", userDao.getOne(id));
//        model.addAttribute("messages", messageDao.findMessagesByRecipient_user_idIs(id));
//        model.addAttribute("smoke", smokerInfo);
//        model.addAttribute("recipId", recip);
//
//        return "messagechat";
//    }

    @GetMapping("/search")
    @ResponseBody
    public List<User> sendMatchingUser(@RequestParam String username){
        System.out.println(username);
        System.out.println(userDao.findByUsernameContaining(username));
        return userDao.findByUsernameContaining(username);
    }
}


