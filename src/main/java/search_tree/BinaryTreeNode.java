package search_tree;

class BinaryTreeNode extends TreeNode{

    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data) {
        super(data);
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