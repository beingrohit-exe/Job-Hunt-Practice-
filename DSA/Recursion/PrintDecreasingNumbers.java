package DSA.Recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 08 January-2024
 * Created_at - 12 : 16
 */

public class PrintDecreasingNumbers {

    public static void printNumber(int n) {
        if (n==0) {
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    public static void main(String[] args) {
        printNumber(10);
    }
}
