package DSA.Recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 08 January-2024
 * Created_at - 13 : 34
 */

public class MaximumOfAnArray {

    public static int max(int[] array, int index) {
        if (index == array.length - 1) return array[index];
        int m = max(array, index + 1);
        if (m > array[index]) {
            return m;
        } else {
            return array[index];
        }
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 5, 7, 8, 2, 7346, 45745, 56}, 0));
    }
}
