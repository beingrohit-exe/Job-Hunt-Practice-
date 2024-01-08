package DSA.Recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 08 January-2024
 * Created_at - 13 : 45
 */

public class FirstOccurrenceOfIndex {

    public static int approachOne(int[] array, int index, int data) {
        if (index == array.length) {
            return -1;
        }
        int a = approachOne(array, index + 1, data);
        if (a == array[index]) {
            return index;
        } else {
            return a;
        }
    }

    public static int firstOccurrence(int[] array, int index, int data) {
        if (index == array.length) {
            return -1;
        }
        if (data == array[index]) return index;
        else return firstOccurrence(array, index + 1, data);
    }
    public static void main(String[] args) {
        System.out.println(approachOne(new int[]{1, 2, 7, 1, 2, 8, 2, 5, 1, 7, 2}, 0, 2));
    }
}
