package DSA.Recursion;

import java.util.ArrayList;

public class GetMazePaths {

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

    if (sr == dr && sc == dc) {
        ArrayList<String> bc = new ArrayList<>();
        bc.add("");
        return bc;
    }
        ArrayList<String> horizontalPaths = new ArrayList<>();
        ArrayList<String> verticalPaths = new ArrayList<>();

        if (sc < dc) {
            horizontalPaths = getMazePaths(sr, sc + 1, dr, dc);
        }

        if (sr < dc) {
            verticalPaths = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> ar = new ArrayList<>();
        for (String hPath : horizontalPaths) {
            ar.add("h" + hPath);
        }

        for (String vPath : verticalPaths) {
            ar.add("v" + vPath);
        }

        return ar;
    }

    public static void main(String[] args) {
        ArrayList<String> mazePaths = getMazePaths(1, 1, 4, 4);
        System.out.println(mazePaths);
    }
}
