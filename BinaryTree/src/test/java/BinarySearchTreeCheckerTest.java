import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchTreeCheckerTest {

    private BinaryTree binaryTree;
    private BinarySearchTreeChecker binarySearchTreeChecker = new BinarySearchTreeChecker();

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
    public void checkWhetherItIsABinarySearchTree() throws Exception {
        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(8);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(10);
        binaryTree.insert(7);

        final Node root = binaryTree.getRoot();
        final Boolean bft = binarySearchTreeChecker.isValidTree(root);
        assertTrue(bft);
    }

    @Test
    public void checkWhetherItIsABinarySearchTreeRecursively() throws Exception {
        final Node root = binaryTree.getRoot();
        final boolean isValid = binarySearchTreeChecker.isValidTreeUsingRecursion(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertTrue(isValid);
    }
}