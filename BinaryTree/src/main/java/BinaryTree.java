public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(Integer data) {
        root = insert(root, data);
    }

    private Node insert(Node node, Integer data) {
        if (node == null) {
            node = new Node(data);
        } else {
            if (data <= node.getData()) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }
}
