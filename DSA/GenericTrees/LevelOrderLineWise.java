package DSA.GenericTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 29 January-2024
 * Created_at - 12 : 19
 */

public class LevelOrderLineWise {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void preOrder(Node root) {
        System.out.print(root.data + " ");
        for (Node child : root.children) preOrder(child);
    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            root = queue.remove();
            System.out.print(root.data + " ");
            for (Node child : root.children) {
                queue.add(child);
            }
        }
    }

    public static void levelOrderLineWise(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        Queue<Node> childQueue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            root = queue.remove();
            System.out.print(root.data + " ");
            for (Node child : root.children) {
                childQueue.add(child);
            }
            if (queue.size() == 0) {
                queue = childQueue;
                childQueue = new ArrayDeque<>();
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
        levelOrder(root);
        levelOrderLineWise(root);
    }
}
