package search_tree;

public class BinarySearchTree  extends Tree<BinaryTreeNode> {

    public BinarySearchTree(String rootData) {
        super(rootData);
        root=new BinaryTreeNode(rootData);
        size++;
    }

    @Override
    public boolean search(TreeNode input) {
        //todo implement search
        return false;
    }

    @Override
    public BinaryTreeNode insert() {
        //todo implement insert
        return null;
    }

    @Override
    public BinaryTreeNode delete() {
        //todo implement delete
        return null;
    }

}
