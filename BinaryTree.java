package abc;
class Node {
    String name;
    Node left, right;

    Node(String name) {
        this.name = name;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        
        root = new Node("Mom");
        root.left = new Node("Dad");
        root.right = new Node("You");
    }

    void printRoot() {
        System.out.println("Root of the tree: " + root.name);
    }

    void printChildren(Node node) {
        if (node == null) return;
        System.out.println("Left child of " + node.name + ": " + (node.left != null ? node.left.name : "null"));
        System.out.println("Right child of " + node.name + ": " + (node.right != null ? node.right.name : "null"));
    }

    void traverseTopToBottom(Node node) {
        if (node == null) return;
        System.out.print(node.name + " ");
        traverseTopToBottom(node.left);
        traverseTopToBottom(node.right);
    }

    int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    int countLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.name + " ");
        inOrder(node.right);
    }

    Node mirror(Node node) {
        if (node == null) return null;
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

    void printPaths(Node node, String path) {
        if (node == null) return;
        path += node.name + " ";
        if (node.left == null && node.right == null) {
            System.out.println("Path: " + path);
        }
        printPaths(node.left, path);
        printPaths(node.right, path);
    }

    boolean isEmpty() {
        return root == null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.printRoot();
        tree.printChildren(tree.root);

        System.out.print("Top to bottom: ");
        tree.traverseTopToBottom(tree.root);
        System.out.println();

        System.out.println("Total nodes: " + tree.countNodes(tree.root));
        System.out.println("Leaf nodes: " + tree.countLeafNodes(tree.root));

        System.out.print("In-order traversal: ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("Mirroring tree...");
        tree.mirror(tree.root);
        System.out.print("After mirror (in-order): ");
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("All paths from root to leaves:");
        tree.printPaths(tree.root, "");

        System.out.println("Is tree empty? " + tree.isEmpty());
    }
}
