package DSA.Recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 08 January-2024
 * Created_at - 13 : 28
 */

public class DisplayArray {

    public static void print(int[] array, int index) {
        if (index==array.length) {
            return;
        }
        System.out.println(array[index]);
        print(array, index + 1);
    }

    public static void main(String[] args) {
        print(new int[]{1, 2, 4, 5, 6, 7}, 0);
    }
}
