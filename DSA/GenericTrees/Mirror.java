package DSA.GenericTrees;

import java.util.*;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 29 January-2024
 * Created_at - 15 : 16
 */

public class Mirror {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (q.size() > 0) {
            root = q.remove();
            System.out.print(root.data + " ");
            for (Node child : root.children) {
                q.add(child);
            }
        }
    }

    public static void mirror(Node root) {
        for (Node child : root.children) {
            mirror(root);
        }
        Collections.reverse(root.children);
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
        levelOrder(root);
    }
}
