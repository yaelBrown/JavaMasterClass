package Arrays;

public class Array {

    public static void main(String[] args) {

        // Create a new array. (need 2 square brackets).
        int[] myVar = new int[5];

        double[] myDoubleArr = new double[10];

        // Shorthand way of assigning values to array
        int[] arr2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            arr2[i] = i * 10;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Element " + i + ", value is " + arr2[i]);
        }

    }
}
