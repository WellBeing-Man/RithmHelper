import org.junit.Test;
import search_tree.BinarySearchTree;
import search_tree.BinaryTreeNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SearchTreeTest {

    @Test
    public void BinarySearchTreeTest(){
            //make bst
            BinarySearchTree binarySearchTree=new BinarySearchTree();

            //insert test
            binarySearchTree.insert(10);
            binarySearchTree.insert(12);
            binarySearchTree.insert(8);
            binarySearchTree.insert(7);
            binarySearchTree.insert(9);
            binarySearchTree.insert(11);
            binarySearchTree.insert(13);

            assertEquals(TestUtils.arrayToString(binarySearchTree.inOrderTraversal().toArray()),
                    TestUtils.arrayToString(new int[]{10,8,7,9,12,11,13}));

            //search test
            assertEquals(binarySearchTree.search(10).getData(),10);
            assertEquals(binarySearchTree.search(12).getData(),12);
            assertEquals(binarySearchTree.search(8).getData(),8);
            assertNull(binarySearchTree.search(1));


            //delete test
            binarySearchTree.delete(7);
            assertEquals(TestUtils.arrayToString(binarySearchTree.inOrderTraversal().toArray()),
                TestUtils.arrayToString(new int[]{10,8,9,12,11,13}));
            binarySearchTree.delete(10);
            assertEquals(TestUtils.arrayToString(binarySearchTree.inOrderTraversal().toArray()),
                TestUtils.arrayToString(new int[]{11,8,9,12,13}));
            binarySearchTree.delete(13);
            assertEquals(TestUtils.arrayToString(binarySearchTree.inOrderTraversal().toArray()),
                TestUtils.arrayToString(new int[]{11,8,9,12}));
    }

    @Test
    public void RedBlackTreeTest(){
        
    }
}
