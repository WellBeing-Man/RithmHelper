package search_tree;

public class RedBlackTreeNode extends BinaryTreeNode {
    public RedBlackTreeNode(int data) {
        super(data);
    }

    enum COLOR{
        RED(0),BLACK(1);

        private final int TAG;
        COLOR(int TAG) {
            this.TAG=TAG;
        }
    }
}
