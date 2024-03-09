package DSA.InterviewQuestions;

import java.util.regex.Pattern;

public class VowelPresent {
    public static void main(String[] args) {
        // String vowelRegex = ".*[aeiou].*";
        // Pattern pattern = Pattern.compile(vowelRegex);
        // boolean matches = pattern.matches(vowelRegex, "ghjgjghjfghj".toLowerCase());
        // System.out.println(matches);
        String data = "Heellooa";
        String vowels = "aeiou";
        int count = 0;
        String[] vowel = vowels.split("");
        for (String a : vowel) {
            if (data.indexOf(a) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
