import java.util.ArrayList;
import java.util.Stack;

public class SuperBalancedChecker {
    public boolean isSuperBalanced(Node root) {

        ArrayList<Integer> depths = new ArrayList<Integer>();

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

    static boolean isDifferenceBetweenTwoDepthsGreaterThanOne(ArrayList<Integer> depths) {
        return depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1;
    }
}