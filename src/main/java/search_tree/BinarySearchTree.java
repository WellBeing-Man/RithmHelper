package search_tree;

public class BinarySearchTree  extends Tree<BinarySearchTree.BinaryTreeNode> {


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
}
