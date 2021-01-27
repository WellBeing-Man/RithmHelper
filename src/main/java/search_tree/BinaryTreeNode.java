package search_tree;

import base.TreeNode;

class BinaryTreeNode extends TreeNode {

    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode parent;

    public BinaryTreeNode(int data) {
        super(data);
    }


    public BinaryTreeNode getParent() {
        return parent;
    }

    public void setParent(BinaryTreeNode parent) {
        this.parent = parent;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

}