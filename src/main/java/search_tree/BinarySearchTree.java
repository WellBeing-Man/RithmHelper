package search_tree;

import base.TreeNode;

public class BinarySearchTree extends Tree<BinaryTreeNode> {

    public BinarySearchTree(int rootData) {
        super(rootData);
        root=new BinaryTreeNode(rootData);
        size++;
    }


    @Override
    public BinaryTreeNode search(int input) {
        //TODO implement search
        return null;
    }

    @Override
    public BinaryTreeNode insert(int T) {
        //TODO implement insert
        return null;
    }

    @Override
    public TreeNode delete(TreeNode input) {
        return null;
    }


}
