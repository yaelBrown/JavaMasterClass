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

        // floats are not perfered floating datatype to use, doubles are.
        // Computers on chip level process double numbers faster.

        // Double (Has double as much info as float)
        double myDoubleNumber = 5.25;

        double pounds = 8d;
        double convertToLBStoKG = pounds * 0.45359237;
        System.out.println("8 pounds is equal to: " + convertToLBStoKG + " kg");

        // Double has more precision than the float.

        // Doubles can also be written with underscores
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(anotherNumber);      // 3000000.456789

        // Line break in results
        System.out.println("==========");

        // Char's support one character or unicode (width of 16 (2 bytes))
        // Char store a single charater
        //  Find unicodes: https://unicode-table.com/en/
        char myChar = '\u00A9';
        char registeredSymbol = '\u00AE';

        // Either true or false
        boolean myBoolean = false;

        // Previous data types are primitive data types.
        // A string is a sequence of characters.
        String myString = "This is a string ";

        // Appending values to a string is inefficient and not recommended.
        //  String buffer is better for that.
        System.out.println(myString + myChar);

        String numberString = "13";

        myFirstNum -= 1;
        System.out.println(myFirstNum);

        // Line break in results
        System.out.println("==========");

        boolean isAlien = false;

        // can use shorthand if statements (as well as ternary operators)
        // if (isAlien == false) System.out.println("It is not a alien");

        if (isAlien == false) {
            System.out.println("It is not a alien");
        } else {
            System.out.println("It is a alien!");
        }

        // Operand is an object that is manipulated by an operator. (Can be any datatype).
        // Expression is formed by combining varaibles, literals, method return values.
        // = is assignment operator. Don't for get it's an Operator !

        // Shorthand for division is the 'meh face' /=. Ex: result /= 3; ( 10 )


        // Ternary operator
        boolean isCar = true;

        boolean wasCar = isCar ? true : false;

        // Single & is a bitwise operator working at the bit level.

        // Java Operators Precedence Table : http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        // Summary of operators : https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
    }
}
