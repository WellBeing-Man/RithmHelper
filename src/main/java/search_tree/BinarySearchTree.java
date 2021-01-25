package search_tree;

public class BinarySearchTree  extends Tree<BinaryTreeNode> {

    public BinarySearchTree(int rootData) {
        super(rootData);
        root=new BinaryTreeNode(rootData);
        size++;
    }

    @Override
    public boolean search(int input) {
        //todo implement search
        return false;
    }

    @Override
    public BinaryTreeNode insert(int input) {
        //todo implement insert
        return null;
    }

    @Override
    public BinaryTreeNode delete(int input) {
        //todo implement delete
        return null;
    }

}
