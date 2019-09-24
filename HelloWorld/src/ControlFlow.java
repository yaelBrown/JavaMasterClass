public class ControlFlow {

    public static void main(String[] args) {
        int switchValue = 3;
        char charValue = 'A';

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        switch(charValue) {
            case 'A':
                System.out.println("The char is: A");
                break;

            case 'B':
                System.out.println("The char is: B");
                break;

            case 'C':
                System.out.println("The char is: C");
                break;

            case 'D':
                System.out.println("The char is: D");
                break;

            case 'E':
                System.out.println("The char is: E");
                break;

            default:
                System.out.println("Letter not found");
                break;
        }

        // use .toLowerCase() method to convert any combination of January, jAnuary, jaNuary to be validated in switch statement.
        String month = "January";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("not sure");
                break;
        }


    }


    // Simple interest to print the amount in interest
    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }
}
