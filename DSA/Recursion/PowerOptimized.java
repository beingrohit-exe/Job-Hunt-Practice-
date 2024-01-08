package DSA.Recursion;

public class PowerOptimized {

    public static int power(int data, int p) {
        if (p==0) {
            return 1;
        }
        if (p%2==0) {
            return power(data, p/2) * power(data, p/2);
        } else {
            return power(data, p/2) * power(data, p/2) * data;
        }
    }

    public static int power2(int d, int p) {
        if (p==0) {
            return 1;
        }
        int a = power2(d, p/2);
        int dp = a * a;

        if (p%2 == 1) {
            dp = dp * d;
        }
        return dp;
    }

    public static void main(String[] args) {
        int power = power2(2, 4);
        System.out.println(power);
        
    }
}
