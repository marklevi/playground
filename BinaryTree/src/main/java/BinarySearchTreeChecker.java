import java.util.Stack;

public class BinarySearchTreeChecker {

    public boolean isValidTree(Node root) {

        final Stack stack = new Stack();
        stack.push(new Tuple(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        while (!stack.isEmpty()) {
            Tuple tuple = (Tuple) stack.pop();

            final int lowerBound = tuple.getLowerBound();
            final int upperBound = tuple.getUpperBound();
            final Node node = tuple.getNode();

            if (node.value < lowerBound || node.value > upperBound)
                return false;

            if (node.right != null)
                stack.push(new Tuple(node.right, node.value, upperBound));

            if (node.left != null)
                stack.push(new Tuple(node.left, lowerBound, node.value));
        }
        return true;
    }

    public boolean isValidTreeUsingRecursion(Node node, int lowerBound, int upperBound) {
        if (node == null) {
            return true;
        }

        if (node.value > upperBound || node.value < lowerBound) {
            return false;
        }

        return isValidTreeUsingRecursion(node.right, node.value, upperBound) && isValidTreeUsingRecursion(node.left, lowerBound, node.value);
    }


    private class Tuple {
        private final Node node;
        private final int lowerBound;
        private final int upperBound;

        public Tuple(Node node, int lowerBound, int upperBound) {
            this.node = node;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }

        public Node getNode() {
            return node;
        }

        public int getLowerBound() {
            return lowerBound;
        }

        public int getUpperBound() {
            return upperBound;
        }
    }
}
