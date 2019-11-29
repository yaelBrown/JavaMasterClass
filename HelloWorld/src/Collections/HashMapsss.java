package Collections;

import java.util.HashMap;

public class HashMapsss {
    // Hashmaps are a list of key and value pairs
    // Purpose of hashmaps is to store multiple number of variables into one place.
    // Don't know why its called hashmap

    // Computer science classes use hashmaps alot
    public static void main(String[] args) {

        // Int here is a primitive type
        int a = 1;
        int b = 2;
        int c = 3;

        HashMap<String, Integer> aa = new HashMap<String, Integer>();

        // Add stuff to hashmap
        aa.put("aaa", 4);
        aa.put("bbb", 5);

        // Prints it out in one line
        System.out.println("aa = " + aa);

        // Prints out the value
        System.out.println(aa.get("bbb"));

        // Removes items from hashmap
        aa.remove("bbb");

        // Print out updated hasmap
        System.out.println("aa = " + aa);

        // boolean that returns true or false if value is present
        // Values are always on the right
        System.out.println(aa.containsValue(4));

        // Provides size
        System.out.println("aa.size() = " + aa.size());

        // Replace
        aa.replace("aaa", 10);
        System.out.println("aa = " + aa);

        // Get all the values
        System.out.println(aa.values());

        // Get all the keys
        System.out.println("aa.keySet() = " + aa.keySet());

    }

}
