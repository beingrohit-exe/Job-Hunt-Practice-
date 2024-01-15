package DSA.Recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 09 January-2024
 * Created_at - 12 : 09
 */

public class LastIndexOfOccurrence {

    public static int lastOccurrence(int[] array, int index, int data) {
        if (index == array.length) {
            return -1;
        }
        int occurrence = lastOccurrence(array, index + 1, data);
        if (occurrence == -1) {
            if (array[index] == data) {
                return index;
            } else {
                return -1;
            }
        } else {
            return occurrence;
        }
    }

    public static void main(String[] args) {
        int lastOccurrence = lastOccurrence(new int[]{2, 3, 6, 9, 8, 3, 2, 3, 6, 4}, 0, 2);
        System.out.println(lastOccurrence);
    }
}
