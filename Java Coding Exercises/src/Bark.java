public class Bark {

    public static Boolean bark(Boolean barking, int hourOfDay) {

        // Verify hour of the day is legit
        if (hourOfDay >= 0 && hourOfDay <= 23) {

            // Check if dog is barking
            if (barking == true){

                // Check if dog is barking at night.
                if (hourOfDay <= 8 || hourOfDay >= 22) {
                    return true;
                } else {
                    // Return false if dog is barking during the day
                    return false;
                }

                // Return false if dog is not barking at all
            } else {
                return false;

            }

        // Hour of the day is not correct.
        } else {
            System.out.println("Invalid hour in the day. ");
            return false;
        }
    }


    public static void main(String[] args) {
        // Test method
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }
}
