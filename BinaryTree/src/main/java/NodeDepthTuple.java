public class NodeDepthTuple {
    private final Node root;
    private final int depth;

    public NodeDepthTuple(Node root, int depth) {
        this.root = root;
        this.depth = depth;
    }
    public int getDepth() {
        return depth;
    }

    public Node getRoot() {
        return root;
    }
}
