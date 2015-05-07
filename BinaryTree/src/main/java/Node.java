public class Node {
    private Integer data;
    public Node left;
    public Node right;

    public Node(Integer data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Integer getData() {
        return data;
    }

}