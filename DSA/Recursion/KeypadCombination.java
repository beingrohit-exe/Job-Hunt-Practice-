package DSA.Recursion;

import java.util.ArrayList;

public class KeypadCombination {

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getCombinations(String data) {
        if (data.isEmpty()) {
            ArrayList<String> ar = new ArrayList<>();
            ar.add("");
            return ar;
        }
        char c = data.charAt(0);
        String subString = data.substring(1);
        ArrayList<String> combinations = getCombinations(subString);
        ArrayList<String> re = new ArrayList<>();
        String code = codes[c - '0'];
        for (int i=0 ; i<code.length() ; i++) {
            char c1 = code.charAt(i);
            for (String a : combinations) {
                re.add(c1 + a);
            }
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(getCombinations("257"));
    }
}
