package DSA.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 31 January-2024
 * Created_at - 20 : 55
 */

public class LinearizeGenericTree {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    private static Node getTail(Node node) {
        while (node.children.size() == 1) {
            node = node.children.get(0);
        }
        return node;
    }

    /**
     *
     * Time Complexity -> O(N^2)
     * @param root
     */
    public static void linearize(Node root) {
        for (Node child : root.children) linearize(child);

        while (root.children.size() > 1) {
            Node lastChild = root.children.remove(root.children.size() - 1);
            Node secondLastChild = root.children.get(root.children.size() - 1); // because we already removed last child that's why we are not using node.children.size() - 2
            Node secondLastChildTail = getTail(secondLastChild);
            secondLastChildTail.children.add(lastChild);
        }
    }

    public static void display(Node root) {
        String str = root.data + " -> ";
        for (Node child : root.children) {
            str += child.data + " , ";
        }
        str += ".";
        System.out.println(str);
        for (Node child : root.children) display(child);
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
        linearize(root);
        display(root);
    }
}
