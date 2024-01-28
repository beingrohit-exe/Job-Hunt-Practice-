package DSA.GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Job Hunt
 * Package - DSA.GenericTrees
 * Created_on - 28 January-2024
 * Created_at - 18 : 18
 */

public class Traversal {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
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
            int childSize = size(child);
            s += childSize;
        }
        s++;
        return s;
    }

    public static int maximum(Node node) {
        int m = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int childMax = maximum(child);
            m = Math.max(m, childMax);
        }
        m = Math.max(m, node.data);
        return m;
    }

    public static int height(Node node) {
        int h = -1;
        for (Node child : node.children) {
            int childHeight = height(child);
            h = Math.max(h, childHeight);
        }
        h++;
        return h;
    }

    public static void traversal(Node node) {
        System.out.println("Node pre : " + node.data);
        for (Node child : node.children) {
            System.out.println("Edge pre : " + node.data + " -- " + child.data);
            traversal(child);
            System.out.println("Edge post : " + node.data + " -- " + child.data);
        }
        System.out.println("Node post : " + node.data);
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
        traversal(root);
    }
}
