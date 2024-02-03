package DSA.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 03 February-2024
 * Created_at - 15 : 28
 */

public class LinearizeEfficientApproach {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void removeLeafs(Node root) {
        for (Node child : root.children) removeLeafs(child);
        for (int i = root.children.size() - 1 ; i>=0 ; i--) {
            Node child = root.children.get(i);
            if (child.children.isEmpty()) root.children.remove(child);
        }
    }

    public static void linearize(Node root) {
        for (Node child : root.children) linearize(child);
        while (root.children.size() > 1) {
            Node lastChild = root.children.remove(root.children.size() - 1);
            Node secondLastChild = root.children.get(root.children.size() - 1);
            Node secondLastChildTail = getTail(secondLastChild);
            secondLastChildTail.children.add(lastChild);
        }
    }

    public static Node linearizeEfficient(Node root) {
        if (root.children.size() == 0) return root;
        Node lastChildTail = linearizeEfficient(root.children.get(root.children.size() - 1));
        while (root.children.size() > 1) {
            Node lastChild = root.children.remove(root.children.size() - 1);
            Node secondLastChild = root.children.get(root.children.size() - 1);
            Node secondLastChildTail = linearizeEfficient(secondLastChild);
            secondLastChildTail.children.add(lastChild);
        }
        return lastChildTail;
    }

    private static Node getTail(Node root) {
        while (root.children.size() == 1) {
            root = root.children.get(0);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int a : array) {
            if (a == -1) st.pop();
            else {
                Node node = new Node();
                node.data = a;
                if (st.size() > 0) st.peek().children.add(node);
                else root = node;
                st.push(node);
            }
        }
    }
}
