package search_tree;

class BinaryTreeNode extends TreeNode{

    BinarySearchTree left;
    BinarySearchTree right;

    public BinaryTreeNode(String data) {
        super(data);
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public BinarySearchTree getRight() {
        return right;
    }

}