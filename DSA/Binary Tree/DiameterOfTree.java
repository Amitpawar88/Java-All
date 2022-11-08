public class DiameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // this class is not mendetory
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Diameter of a tree -> number of nodes in the longest path between two leafs

        // approach 1 -> O(n^2)
        public static int dia(Node root) {
            if (root == null) {
                return 0;
            }

            int leftDia = dia(root.left);
            int rightDia = dia(root.right);
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int selfDia = leftHeight + rightHeight + 1;
            return Math.max(Math.max(rightDia, leftDia), selfDia);
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        // approach 2 -> O(n)
        static class Info {
            int dia;
            int ht;

            public Info (int dia, int ht) {
                this.dia = dia;
                this.ht = ht;
            }
        }
        public static Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(dia, ht);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(BinaryTree.dia(root));
        System.out.println(BinaryTree.diameter(root).dia);

    }
}
