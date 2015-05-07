import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BinaryTreeTest {

    @Test
    public void buildBinaryTreeWith123() throws Exception {
        final BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(3);

        final Node root = binaryTree.getRoot();

        assertThat(root.getData(), is(2));
        assertThat(root.left.getData(), is(1));
        assertThat(root.right.getData(), is(3));
    }
}