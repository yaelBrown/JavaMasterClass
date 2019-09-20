public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNum(121));

        reverseNum(707);
    }

    public static int reverseNum (int num) {
        int aa = num;
        int reversed = 0;
        int digit;

        while (aa != 0) {
            digit = aa % 10;
            reversed = reversed * 10 + digit;
            aa /= 10;
        }

        aa = num;

        // for comparing if reversed number is Palindrome
        System.out.println(aa == reversed);

        return reversed;
    }

}
