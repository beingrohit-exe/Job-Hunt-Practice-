package DSA.InterviewQuestions;

public class ReverseString {

    public static String reverse(String data) {
        if (data == null) {
            throw new RuntimeException("Data Null");
        }
        if (data.length() == 1 || data.isEmpty()) {
            return data;
        }
        
        // rakesh -> hsekar
        String reverse = "";
        char[] charArray = data.toCharArray(); 

        for (int i=charArray.length - 1 ; i>=0 ; i--) {
            reverse+= charArray[i];
        }
        return reverse;
    }
    
    public static void main(String[] args) {
        String str = "Rakesh";
        String reverse = reverse(str);
        System.out.println(reverse);
    }
}
