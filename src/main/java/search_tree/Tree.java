package search_tree;

import base.DynamicSet;
import base.TreeNode;

abstract public class Tree<T> implements DynamicSet<TreeNode> {

    protected TreeNode root;
    protected int size;

    public Tree(int rootData) {
    }
}
