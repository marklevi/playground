import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
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

        assertThat(root.value, is(5));

        Node rootLeft = root.left;
        assertThat(rootLeft.value, is(2));
        assertThat(rootLeft.left.value, is(1));
        assertThat(rootLeft.right.value, is(3));

        Node rootRight = root.right;
        assertThat(rootRight.value, is(8));
        assertThat(rootRight.left.value, is(7));
        assertThat(rootRight.right.value, is(10));
    }

    @Test
    public void checkWhetherItIsABinarySearchTree() throws Exception {
        final Node root = binaryTree.getRoot();

        final Boolean bft = binaryTree.isBFT(root);

        assertTrue(bft);
    }

    @Test
    public void shouldBeASuperBalancedTree() throws Exception {
           // 5
         //2    8
       //1  3  7  10

        Node root = binaryTree.getRoot();

        boolean superBalanced = new SuperBalancedChecker().isSuperBalanced(root);
        assertTrue(superBalanced);

    }

    @Test
    public void shouldNotBeASuperBalancedTree() throws Exception {
           // 5
        //2    10
     //1   4
   //    3

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