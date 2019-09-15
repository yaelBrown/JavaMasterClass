/*
    Variables Datatypes and Operators
 */

public class Hello {

    public static void main(String[] args) {
        // Hello Yael!
        System.out.println("Hello Yael!");

        // Declaring integers (width of 32)
        int myFirstNum = 5;
        int mySecondnum = 12;
        int myThirdNumber = 6;

        int myTotal = myFirstNum + mySecondnum + myThirdNumber;

        System.out.println(myFirstNum);
        System.out.println(myTotal);

        int result = 1000 - myTotal;

        /*
            Literals are whole number.
            '2+3' are expressions
         */

        System.out.println(result);

        // Line break in results
        System.out.println("==========");

        // Get maximum value for datatypes = "[dataType].MAX_VALUE;"
        // Get minimum value for datatypes = "[dataType].MIN_VALUE;"
        // Smaller datatype takes up much smaller space in memory. Good for performance.

        // Bytes use less space than integers (width of 8)
        byte myByteValue = -128;

        byte myNewByteValue = (byte) (myByteValue / 2);

        // Shorts (width of 16)
        short myShortValue = 32767;

        // Long (width of 64)
        long myLongValue = 9_223_372_036_854_775_807L;

        // Practice casting
        long demo = 10000;

        // need a 'L' after the number for Long. long [varName] = 100L;

        long a = (long) (demo * myByteValue) + myShortValue + result;

        System.out.println(a);

        // Longs will happily accept integer values, because a maximum integer value will fit within a long value.

        // Line break in results
        System.out.println("==========");

        // Float (add f after the number)
        float myFloatNumber = 5f;

        // Double (Has double as much info as float)
        double myDoubleNumber = 5.25;

        double pounds = 8d;
        double convertToLBStoKG = pounds * 0.45359237;
        System.out.println("8 pounds is equal to: " + convertToLBStoKG + " kg");

        // Line break in results
        System.out.println("==========");

        // Char's support one character or unicode (width of 16 (2 bytes))
        char myChar = '\u00A9';
        char registeredSymbol = '\u00AE';

        // Either true or false
        boolean myBoolean = false;

        // Previous data types are primitive data types.
        String myString = "This is a string ";

        System.out.println(myString + myChar);

        String numberString = "13";

        myFirstNum -= 1;
        System.out.println(myFirstNum);

        // Line break in results
        System.out.println("==========");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not a alien");
        } else {
            System.out.println("It is a alien!");
        }
        
        // Ternary operator
        boolean isCar = true;

        boolean wasCar = isCar ? true : false;
    }
}
