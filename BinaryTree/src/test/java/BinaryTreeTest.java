import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @Before
    public void setUp() throws Exception {
        binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(8);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(10);
        binaryTree.insert(7);

    }

    @Test
    public void buildBinaryTree() throws Exception {

        final Node root = binaryTree.getRoot();
        binaryTree.printTree(root);

        assertThat(root.getData(), is(5));

        Node rootLeft = root.left;
        assertThat(rootLeft.getData(), is(2));
        assertThat(rootLeft.left.getData(), is(1));
        assertThat(rootLeft.right.getData(), is(3));

        Node rootRight = root.right;
        assertThat(rootRight.getData(), is(8));
        assertThat(rootRight.left.getData(), is(7));
        assertThat(rootRight.right.getData(), is(10));
    }

    @Test
    public void checkWhetherItIsABinarySearchTree() throws Exception {
        final Node root = binaryTree.getRoot();

        final Boolean bft = binaryTree.isBFT(root);

        assertTrue(bft);


    }
}