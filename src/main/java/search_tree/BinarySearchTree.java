package search_tree;

import base.TreeNode;

public class BinarySearchTree extends Tree<BinaryTreeNode> {

    public BinarySearchTree(int rootData) {
        super(rootData);
        root=new BinaryTreeNode(rootData);
        size++;
    }


    @Override
    public TreeNode search(int input) {
        return null;
    }

    @Override
    public TreeNode insert(int T) {
        return null;
    }

    @Override
    public boolean delete(int input) {
        return false;
    }
}
