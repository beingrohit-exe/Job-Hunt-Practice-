package DSA.Recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 08 January-2024
 * Created_at - 13 : 32
 */

public class DisplayArrayReverse {

    public static void printReverse(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        printReverse(array, index + 1);
        System.out.println(array[index]);
    }

    public static void main(String[] args) {
        printReverse(new int[]{1, 2, 3, 4, 5, 6, 7}, 0);
    }
}
