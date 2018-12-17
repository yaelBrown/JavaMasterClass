public class MegaBytesConverter {

    // Method converts KB to MB
    private static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // Checks if number entered is positive.
        if (kiloBytes >= 0) {
            int megabytes = kiloBytes / 1024;
            int megabytesModulus = kiloBytes % 1024;

            // Prints results of calculations as a string.
            System.out.println(kiloBytes + " KB = " + megabytes + "MB and " + megabytesModulus + " KB");
        } else {
            // If negative number is entered.
            System.out.println("Invalid Value.");
        }
    }

    public static void main(String[] args) {
        // executes method
        printMegaBytesAndKiloBytes(1024);
    }
}