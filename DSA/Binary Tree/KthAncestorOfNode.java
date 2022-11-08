public class KthAncestorOfNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
        }
    }

    private static int kAnestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = kAnestor(root.left, n, k);
        int rightDist = kAnestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            return root.data;
        }
        return max + 1;
    } 

    public static void main(String[] args) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        int n = 5; 
        int k = 2;
        System.out.println(kAnestor(root, n, k));
    }
}
