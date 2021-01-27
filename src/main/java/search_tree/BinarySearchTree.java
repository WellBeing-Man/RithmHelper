package search_tree;

import base.TreeNode;

public class BinarySearchTree extends Tree<BinaryTreeNode> {

    public BinarySearchTree(int rootData) {
        super(rootData);
    }


    @Override
    public TreeNode search(int input) {
        BinaryTreeNode node=(BinaryTreeNode) root;

        while (node.getData()!=input){
            if(node.getData()>input){
                node=node.getRight();
            }else {
                node=node.getLeft();
            }
        }

        if(node.getData()!=input){
            return null;
        }
        return node;
    }

    @Override
    public TreeNode insert(int T) {


        BinaryTreeNode node=(BinaryTreeNode) root;
        BinaryTreeNode newNode= new BinaryTreeNode(T);
        BinaryTreeNode parent=null;
        if(root==null){
            root=newNode;
        }

        while (node!=null){
            parent=node;
            if(node.getData()>T){
                    node=node.getRight();
            }else {
                node=node.getLeft();
            }
        }

        if(newNode.getData()>parent.getData()){
            parent.setRight(newNode);
        }else{
            parent.setLeft(newNode);
        }

        newNode.parent=parent;

        return newNode;
    }

    @Override
    public boolean delete(int input) {
        return false;
    }



    private BinaryTreeNode findSuccessor(BinaryTreeNode node){
        if (node.getRight()!=null){
            return smallestCase1(node.getRight());
        }else {
            return  rightChildCase2(node);
        }
    }

    private BinaryTreeNode smallestCase1(BinaryTreeNode node) {
            if(node.getLeft() == null){
                return node;
            }
            return smallestCase1(node.getLeft());
    }

    private BinaryTreeNode rightChildCase2(BinaryTreeNode node){
        BinaryTreeNode parent=node.parent;
        while (parent.getLeft() != node){
            node=parent;
            parent=node.getParent();
        }

        return node.getRight();
    }
}
