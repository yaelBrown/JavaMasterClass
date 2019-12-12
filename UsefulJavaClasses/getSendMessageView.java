    // View all messages and shows unique authors
    @GetMapping("/message")
    public String getSendMessageView(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long id = user.getId();
        int unreadNotifications = unreadNotificationsCount(notiDao, id);

        // Get all messages from for current user and add unique messages to another list and pass it to the view.
        // Get all msgs
        List<Messages> msgs = messageDao.findDistinctByRecipient_user_idOrAuthor_user_id(id);
        ArrayList<MessagesUnique> temp = new ArrayList<MessagesUnique>();

        // Filter for only logged in user
        for(Messages m : msgs) {
            if (m.getRecipient_user_id() == id) {
                temp.add(new MessagesUnique(m.getRecipient_user_id(), userDao.findUserById((long) m.getRecipient_user_id()).getUsername()));
            } else if (m.getAuthor_user_id() == id) {
                temp.add(new MessagesUnique(m.getRecipient_user_id(), userDao.findUserById((long) m.getRecipient_user_id()).getUsername()));
            }
        }

        List<MessagesUnique> uniques = new ArrayList<MessagesUnique>();
        System.out.println("uniques.size() after declaration = " + uniques.size());
        System.out.println("all messages size:  msgs.size() = " + msgs.size());

        System.out.println("====================Whats in temp");
        ArrayList<String> tempAL = new ArrayList<String>();
        for (MessagesUnique t : temp ) {
            System.out.println("t.getUsername() = " + t.getUsername());
            tempAL.add(t.getUsername());
        }

        List<String> tempALDistinct = tempAL.stream().distinct().collect(Collectors.toList());

        System.out.println("===================Unique list distinct");
        System.out.println("tempALDistinct.size() = " + tempALDistinct.size());
        for (String aa : tempALDistinct) {
            System.out.println("aa = " + aa);
        }

        // Create uniques and pass to view
        for (String bb : tempALDistinct) {
            if (bb.equals(user.getUsername())) continue;
            uniques.add(new MessagesUnique(userDao.findByUsername(bb).getId(), bb));
        }

        System.out.println("=============================");
        System.out.println("temp.size() = " + temp.size());
        System.out.println("uniques.size() = " + uniques.size());

        model.addAttribute("uniqueMsgs", uniques);

        model.addAttribute("alertCount", unreadNotifications); // shows count for unread notifications
        model.addAttribute("smoke", smokeDao.getOne(id));
        model.addAttribute("users", userDao.getOne(id));

        return "message-view-all";
    }