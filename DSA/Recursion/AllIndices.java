package DSA.Recursion;

public class AllIndices {

    public static int[] allIndices(int[] array, int x, int index, int fsf) {
        if (index == array.length) {
            return new int[fsf];
        }
        if (array[index] == x) {
            int[] iArray = allIndices(array, x, index + 1, fsf + 1);
            iArray[fsf] = index;
            return iArray;
        } else {
            int[] iArray = allIndices(array, x, index + 1, fsf);
            return iArray;
        }
    }

    public static void main(String[] args) {
        int[] allIndices = allIndices(new int[]{2, 3, 6, 9, 8, 3, 2, 3, 6, 4}, 2, 0, 0);
        for (int a : allIndices) {
            System.out.print(a + " ");
        }
    }
    
}
