package DSA.Recursion;

import java.util.ArrayList;

public class GetJumpMazePaths {
    
    public static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc ==dc) {
            ArrayList<String> bc = new ArrayList<>();
            bc.add("");
            return bc;
        }

        ArrayList<String> ar = new ArrayList<>();

        for (int ms = 1 ; ms <= dc - sc ; ms++) {
            ArrayList<String> hPaths = getPaths(sr, sc + ms, dr, dc);
            for (String hPath : hPaths) {
                ar.add("h" + ms + hPath);
            }
        }

        for (int ms = 1 ; ms <= dr - sr ; ms++) {
            ArrayList<String> vPaths = getPaths(sr + ms, sc, dr, dc);
            for (String vPath : vPaths) {
                ar.add("v" + ms + vPath);
            }
        }

        return ar;
    }

    public static void main(String[] args) {
        ArrayList<String> paths = getPaths(1, 1, 4, 4);
        System.out.println(paths);
    }
}
