/*
 * File: Variables.java
 * Author: Yael Brown
 * Date: October 27, 2017
 * Purpose: Notes on Java Variables
 */

public class Variables {
    // Instance Variables, fields declared without static. Unique to each instance of the class.
    int aa = 0;
    int ab = 0;
    int ac = 0;

    // Class variable is any field declared with the static modifier.
    static int ad = 0;
    static int ae = 0;
    static int af = 0;

    // Local variables are only visible to the methods in which they are declared.
    public static void ba() {
        @SuppressWarnings("unused")
        int ag = 0;// local variable
    }

    /*
     * Variable names are case-sensitive:
     * 		variableNames = lower camel case
     * 		ClassNames = upper camel case
     * 		CONSTANTS = upper case
     */

    /*
     * Primitive Data Types (8):
     * 		Java is statically-typed. Must variables must be declared before they can be used.
     *
     *  		byte - 8-bit integer. (min: -128, max: 127 (inclusive))
     *  			Useful for saving memory in large arrays.
     *
     *  		short - 16-bit integer. (min: -32768, max: 32767 (inclusive))
     *  			Can save memory in large arrays.
     *
     *  		int - 32-bit integer. (min: -2^31, max: 2^31-1)
     *
     *  		long - 64-bit integer. (min: -2^63, max 2^63-1)
     *  			Use this data type when you need a range of values wider than int.
     *
     *  		float - 32-bit IEEE 754 floating point.
     *  			Used to save memory in large arrays of floating point numbers.
     *  			Should not be used for currency. (use java.math.BigDecimal class instead).
     *
     *  		double - 64-bit IEEE 754 floating point.
     *  			For decimal values, this data type is generally the default choice.
     *  			Should not be used for currency.
     *
     *  		boolean - only 2 values, true and false. Size is not precisely defined.
     *
     *  		char - single 16-bit Unicode character. (min: '\u0000' (or 0), max: '\uffff' (or 65,535 inclus.))
     *
     *  	Java provides special support for character Strings. (java.lang.String).
     *  		Enclosing text with double quotes automaticaly create a new string object.
     *
     */

    /*
     * Default Values
     * 		Relying on default values is generally considered bad programming style.
     *
     * 		byte 		0
     * 		short		0
     * 		int 		0
     * 		long		0L
     * 		float 		0.0f
     * 		double		0.0d
     * 		char		'\u0000'
     * 		boolean		false
     * 		String 		null
     *
     */

    // Literal is the source code representation of a fixed value.
    boolean result = true;
    char capitalC = 'C';
    byte b = 100;
    short s = 10000;
    int i = 100;


}

