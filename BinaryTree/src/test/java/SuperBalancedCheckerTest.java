import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SuperBalancedCheckerTest {

    @Test
    public void shouldBeASuperBalancedTree() throws Exception {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(8);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(10);
        binaryTree.insert(7);
        Node root = binaryTree.getRoot();

        boolean superBalanced = new SuperBalancedChecker().isSuperBalanced(root);
        assertTrue(superBalanced);

    }

    @Test
    public void shouldNotBeASuperBalancedTree() throws Exception {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(4);
        binaryTree.insert(3);
        binaryTree.insert(10);


        Node root = binaryTree.getRoot();

        boolean superBalanced = new SuperBalancedChecker().isSuperBalanced(root);
        assertFalse(superBalanced);
    }

}