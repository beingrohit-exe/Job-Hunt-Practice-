package DSA.Recursion;

public class RecursionFlow {

    public static void flow(int a) {
        if (a==0) {
            return;
        }
        System.out.println("Pre Area : " + a);
        flow(a-1);
        System.out.println("In Area : " + a);
        flow(a-1);
        System.out.println("Post Area : " + a);
    }

    public static void main(String[] args) {
        flow(2);
    }
}
