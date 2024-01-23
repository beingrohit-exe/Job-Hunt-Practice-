package DSA.Sort;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Sort
 * Created_on - 23 January-2024
 * Created_at - 19 : 05
 */

public class BubbleSort {

    public static void bubbleSort(int[] array) {

        for (int i=1 ; i<=array.length - 1 ; i++) { // Because there is n-1 iterations
            for (int j=0 ; j<array.length - i ; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 8, 2, 1};
        bubbleSort(array);

        for (int a : array) {
            System.out.println(a);
        }
    }
}
