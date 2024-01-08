package DSA.Recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(int plates, int a, int b, int c) {
        if (plates==0) {
            return;
        }
        towerOfHanoi(plates-1, a, c, b);
        System.out.println(plates + " [ " + a + " -> " + b + " ] ");
        towerOfHanoi(plates-1, c, b, a);
    }

    
    public static void main(String[] args) {
        towerOfHanoi(3, 10, 11, 12);
    }
}
