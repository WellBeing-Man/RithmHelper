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
        BinaryTreeNode node=(BinaryTreeNode) root;

        while (node.getData()!=input){
            if(node.getData()<input){
                node=node.getRight();
            }else if(node.getData()>input){
                node=node.getLeft();
            }
            if(node==null){
                break;
            }
        }

       return node;
    }

    @Override
    public BinaryTreeNode insert(int T) {


        BinaryTreeNode node=(BinaryTreeNode) root;
        BinaryTreeNode newNode= new BinaryTreeNode(T);
        BinaryTreeNode parent=null;
        if(root==null){
            root=newNode;
            return newNode;
        }

        while (node!=null){
            parent=node;
            if(node.getData()<T){
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

        size++;
        return newNode;
    }



    public TreeNode delete(int data){
        return delete(search(data));
    }

    @Override
    public TreeNode delete(TreeNode input) {
        BinaryTreeNode node=(BinaryTreeNode)input;
        if(node.getRight() == null && node.getLeft() == null) {
            if(node.getParent().getLeft()==node){
                node.getParent().setLeft(null);
            }else{
                node.getParent().setRight(null);
            }
        }else if(node.getRight() == null){
             node=node.getLeft();
        }else if(node.getLeft()==null){
               node=node.getRight();
        }else {
            BinaryTreeNode successor = findSuccessor(node);
            node.setData(successor.getData());

            if (successor.getRight() == null) {
                if(successor.getParent().getRight()==successor){
                    successor.getParent().setRight(null);
                }else{
                    successor.getParent().setLeft(null);
                }
            } else{
                successor = successor.getRight();
            }
        }

        return node;
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
