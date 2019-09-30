package Arrays;

import java.util.Arrays;

public class Types {

    public static void main(String[] args) {

        // Int, Arr's and Bool's are value types

        int aa = 10;
        int bb = aa;

        System.out.println("bb = " + bb);
        
        bb++;

        System.out.println("bb = " + bb);

        // Reference types: Arrays or classes
        // Reference holds a reference to the address of the object, but not the value's itself.
        int[] cc = new int[5];
        int[] cd =  cc;

        System.out.println("cd.toString() = " + cd.toString()); // Returns memory address
        System.out.println(Arrays.toString(cd)); // Prints an array of 0's.

        System.out.println("cc.toString() = " + cc.toString()); // is the same as cd

        // CC and CD point to same array in memory. Example of reference type.

        // If you make a change to one array that is being references output to all arrays that refer to the same reference get updated.

        cc[0] = 1;

        System.out.println("cc = " + Arrays.toString(cc)); // at index 0 it's 1
        System.out.println("cd = " + Arrays.toString(cd)); // at index 0 it's 1

        // Dereferences cd
        cd = new int[] {4,5,6,7,8};

        System.out.println("cd = " + cd);
        System.out.println("cd = " + Arrays.toString(cd));

    }

}
