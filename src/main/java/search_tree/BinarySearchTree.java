package search_tree;

import base.TreeNode;

import java.util.ArrayList;

public class BinarySearchTree extends Tree<BinaryTreeNode> {

    private ArrayList<Integer> traversalResult;

    public BinarySearchTree() {
        super();
        traversalResult=new ArrayList<>();
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

    public TreeNode delete(int data){
        return delete(search(data));
    }

    @Override
    public TreeNode delete(TreeNode input) {
        return null;
    }



    public ArrayList<Integer> inOrderTraversal(){
        traversalResult=new ArrayList<>();
        inOrderTraversal((BinaryTreeNode)root);

        return traversalResult;
    }

    private void inOrderTraversal(BinaryTreeNode node){
        if(node!=null){
            traversalResult.add(node.getData());
            inOrderTraversal(node.getLeft());
            inOrderTraversal(node.getRight());
        }
    }
}
