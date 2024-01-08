package DSA.Recursion;

public class Power {

    public static int power(int data, int p) {
        if (p==0) {
            return 1;
        }
        return data * power(data, p-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 2));
    }
}
