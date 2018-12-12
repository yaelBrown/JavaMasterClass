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

        // Bytes use less space than integers (width of 8)
        byte myByteValue = -128;

        byte myNewByteValue = (byte) (myByteValue/2);

        // Shorts (width of 16)
        short myShortValue = 32767;

        // Long (width of 64)
        long myLongValue = 9_223_372_036_854_775_807L;

    }
}
