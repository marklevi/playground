public class BinaryTree {
    private Node root;
    private static int index = 0;

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

    public void printTree(Node node) {
        if (node == null) return;
        printTree(node.left);
        System.out.println(node.getData());
        printTree(node.right);
    }

    public Boolean isBFT(Node root) {
        int[] array = new int[7];
        copyValuesToArray(array, root);

        for (int i = 1; i < array.length; i++) {
            if(array[i - 1] > array[i]){
                return false;
            }
        }
        return true;
    }

    private void copyValuesToArray(int[] array, Node root) {
        if (root == null) return;
        copyValuesToArray(array, root.left);
        array[index] = root.getData();
        index++;
        copyValuesToArray(array, root.right);
    }
}
