package DSA.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 29 January-2024
 * Created_at - 12 : 48
 */

public class LevelOrderLineWiseZigZag {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void levelOrderZigZag(Node root) {
        Stack<Node> ms = new Stack<>();
        Stack<Node> cs = new Stack<>();
        ms.push(root);
        int level = 1;
        while (ms.size() > 0) {
            root = ms.pop();
            System.out.print(root.data + " ");

            if (level%2==1) { //odd
                for (int i=0 ; i<root.children.size() ; i++) {
                    cs.push(root.children.get(i));
                }
            } else {
                for (int i = root.children.size() - 1 ; i>=0 ; i--) {
                    cs.push(root.children.get(i));
                }
            }

            if (ms.size() == 0) {
                ms = cs;
                level++;
                cs = new Stack<>();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int a : array) {
            if (a == -1) {
                st.pop();
            } else {
                Node node = new Node();
                node.data = a;
                if (st.size() > 0) {
                    st.peek().children.add(node);
                } else {
                    root = node;
                }
                st.push(node);
            }
        }
        levelOrderZigZag(root);
    }
}
