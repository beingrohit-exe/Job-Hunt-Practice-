package DSA.Recursion;

import java.util.ArrayList;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.Recursion
 * Created_on - 10 January-2024
 * Created_at - 20 : 46
 */

public class StairsPath {

    public static ArrayList<String> getPaths(int n) {
        if (n==0) {
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        } else if (n < 0) {
            ArrayList<String> b = new ArrayList<>();
            return b;
        }
        ArrayList<String> paths1 = getPaths(n - 1);
        ArrayList<String> paths2 = getPaths(n - 2);
        ArrayList<String> paths3 = getPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add(1 + path);
        }

        for (String path : paths2) {
            paths.add(2 + path);
        }

        for (String path : paths3) {
            paths.add(3 + path);
        }

        return paths;
    }

    public static void main(String[] args) {
        System.out.println(getPaths(4));
    }
}
