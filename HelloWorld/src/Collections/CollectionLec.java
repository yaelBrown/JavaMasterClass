/*

import movies.Movie;
import my_store.Iphone;
import my_store.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionLec {

    public static void main(String[] args) {

        mapsExample();

        // Integer[] numbers = new Integer[1];
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());

//        numbers[0] = 1;
        numbers.add(1);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.add(3);
        System.out.println("numbers.size() = " + numbers.size());

        numbers.add(8);
        numbers.add(5);
        numbers.add(8);

//        numbers[1]
        System.out.println("numbers.get(1) = " + numbers.get(1));

        System.out.println("numbers.indexOf(3) = " + numbers.indexOf(18));

        System.out.println(numbers.toString());

//        numbers.remove(numbers.lastIndexOf(8));
//        Object eight = 8;
//        numbers.remove(eight);

//        Removes all the 8's from the original one
//        ArrayList<Integer> numbersToRemove = new ArrayList<>();
//        numbersToRemove.add(8);
//
//        numbers.removeAll(numbersToRemove);

        System.out.println(numbers.toString());

        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());

        if(numbers.contains(8)){
            System.out.println("Lucky number");
        }

        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new Phone(5.6, "Android"));
        phones.add(new Phone(6.0, "iOS"));
        phones.add(new Iphone(6.0));

        for (Phone phone: phones) {
            phone.makeCall("210");
        }

        System.out.println(phones.get(1).getOS());
        System.out.println(phones.get(2).getOS());

    }

    public static void mapsExample(){
        HashMap<Long, String> users = new HashMap<>();
        users.put(1L, "fmendozaro");
        users.put(2L, "rorsinger");
        users.putIfAbsent(2L, "danielfryar");
        users.put(9L, "fmendozaro");

        for (String val : users.values()) {
            System.out.println("val = " + val);
        }

        users.remove(9L);

        for (Long key : users.keySet()) {
            System.out.println("users = " + users.get(key));
        }

//        this doesn't break the execution of the program
        users.remove(9L);

        System.out.println("users.get(1L) = " + users.get(1L));
        System.out.println("users.get(2L) = " + users.get(2L));
        System.out.println("users.get(3L) = " + users.getOrDefault(3L, "no an existing user"));

        System.out.println("users.containsKey(8L) = " + users.containsKey(8L));

        System.out.println("users.containsValue(\"fmendozaro\") = " + users.containsValue("fmendozaro"));

//tt7286456
        HashMap<String, Movie> fmdb = new HashMap<>();


        fmdb.put("tt7286456", new Movie("Joker", "Crime, Drama, Thriller"));
        fmdb.put("tt7286457", new Movie("Joker II", "Crime, Drama"));

        for (String id : fmdb.keySet()){
            System.out.println("id = " + id);
            System.out.println("getName = " + fmdb.get(id).getName());
            System.out.println("getCategory = " + fmdb.get(id).getCategory());
        }

        oldLanguages();
        languages();

    }

    @SuppressWarnings("all")
    public static List<String> languages() {
        return new ArrayList();
    }

    @Deprecated
    public static List<String> oldLanguages() {
        return new ArrayList();
    }

}

 */