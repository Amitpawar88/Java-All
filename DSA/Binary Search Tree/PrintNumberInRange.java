public class PrintNumberInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data > k1 && root.data < k2) {
            System.out.print(root.data + " ");
        }
        if (root.data > k1) {
            printRange(root.left, k1, k2);
        } 
        if (root.data < k2) {
            printRange(root.right, k1, k2);
        }
    }

    public static void main(String[] aa) {
        int[] nodes = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }
        // inorder(root);
        // System.out.println();
        // inorder(root);

        printRange(root, 5, 12);
    }
}
