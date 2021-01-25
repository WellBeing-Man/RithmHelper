package search_tree;

abstract public class Tree<T> implements SearchStructure<TreeNode> {

    protected TreeNode root;
    protected int size;

    public Tree(int rootData) {
    }
}
