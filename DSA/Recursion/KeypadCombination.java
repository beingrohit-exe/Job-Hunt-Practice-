package DSA.Recursion;

import java.util.ArrayList;

public class KeypadCombination {

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getCombinations(String str) {
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> combinations = getCombinations(ros);
        ArrayList<String> list = new ArrayList<>();
        String codesForeach = codes[ch];
        for (int i = 0; i < codesForeach.length(); i++) {
            char chCode = codesForeach.charAt(i);
            for (String co : combinations) {
                list.add(chCode + co);
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
