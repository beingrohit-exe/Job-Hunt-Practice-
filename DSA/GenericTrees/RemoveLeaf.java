package DSA.GenericTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 31 January-2024
 * Created_at - 20 : 44
 */

public class RemoveLeaf {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void mirror(Node node) {
        for (Node child : node.children) mirror(child);
        Collections.reverse(node.children);
    }

    public static void removeLeafs(Node node) {
        for (Node child : node.children) removeLeafs(child);
        for (int i = node.children.size() - 1 ; i>=0 ; i--) {
            Node child = node.children.get(i);
            if (child.children.isEmpty()) node.children.remove(child);
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
    }
}
