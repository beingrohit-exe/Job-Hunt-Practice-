package DSA.Recursion;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 15 January-2024
 * Created_at - 12 : 08
 */

public class PrintPermutations {

    public static void permutations(String str, String asf) {
        if (str.isEmpty()) {
            System.out.println(asf);
            return;
        }
        // Length of str means the choices we have
        for (int i=0 ; i<str.length() ; i++) {
            char ch = str.charAt(i);
            String leftPart = str.substring(0, i);
            String rightPart = str.substring(i + 1);
            permutations(leftPart + rightPart, asf + ch);
        }
    }

    public static void main(String[] args) {
        permutations("abc", "");
    }
}
