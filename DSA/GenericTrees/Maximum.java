package DSA.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 23 January-2024
 * Created_at - 16 : 07
 */

public class Maximum {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + "->";
        for (Node child : node.children) {
            str += child.data + " , ";
        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }
    }

    public static int size(Node node) {
        int s = 0;
        for (Node child : node.children) {
            int size = size(child);
            s += size;
        }
        s = s + 1;
        return s;
    }

    public static int maximum(Node node) {
        int max = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int childMax = maximum(child);
            max = Math.max(childMax, max);
        }
        max = Math.max(max, node.data);
        return max;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int i=0 ; i<array.length ; i++) {
            if (array[i] == -1) {
                st.pop();
            } else {
                Node node = new Node();
                node.data = array[i];
                if (st.size() > 0) {
                    st.peek().children.add(node);
                } else {
                    root = node;
                }
                st.push(node);
            }
        }
        System.out.println(size(root));
    }
}
