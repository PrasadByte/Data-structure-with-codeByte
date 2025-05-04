package trees;

// Node class representing each node of the tree
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Tree class with traversal logic
public class BinarySearchTree {

    // In-order traversal
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Pre-order traversal
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Post-order traversal
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        // Manually creating the tree
        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;

        // Displaying traversals
        System.out.println("In-order Traversal:");
        inorder(root);  // Output: 40 20 50 10 60 30

        System.out.println("\nPre-order Traversal:");
        preorder(root);  // Output: 10 20 40 50 30 60

        System.out.println("\nPost-order Traversal:");
        postorder(root);  // Output: 40 50 20 60 30 10
    }
}
