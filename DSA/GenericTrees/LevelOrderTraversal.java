package DSA.GenericTrees;

import com.sun.jdi.IntegerType;

import java.util.*;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 28 January-2024
 * Created_at - 19 : 01
 */

public class LevelOrderTraversal {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void levelOrder(Node node) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (queue.size() > 0) {
            node = queue.remove();
            System.out.print(node.data + " ");
            for (Node child : node.children) {
                queue.add(child);
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
        levelOrder(root);
    }
}
