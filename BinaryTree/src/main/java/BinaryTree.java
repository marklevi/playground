import java.util.ArrayList;
import java.util.Stack;

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
            if (array[i - 1] > array[i]) {
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

    public boolean isSuperBalanced(Node root) {

        ArrayList<Integer> depths = new ArrayList<>();

        Stack stack = new Stack();
        stack.push(new NodeDepthTuple(root, 0));

        while (!stack.isEmpty()) {
            NodeDepthTuple tuple = (NodeDepthTuple) stack.pop();
            final int depth = tuple.getDepth();
            final Node node = tuple.getRoot();

            if (node.right == null && node.left == null) {

                if (!depths.contains(depth)) {
                    depths.add(depth);

                    if (depths.size() > 2 || isDifferenceBetweenTwoDepthsGreaterThanOne(depths)) {
                        return false;
                    }
                }
            } else {
                if (node.left != null)
                    stack.push(new NodeDepthTuple(node.left, depth + 1));
                if (node.right != null)
                    stack.push(new NodeDepthTuple(node.right, depth + 1));
            }
        }
        return true;
    }

    private boolean isDifferenceBetweenTwoDepthsGreaterThanOne(ArrayList<Integer> depths) {
        return depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1;
    }
}
