package graph;

import base.TreeNode;


public class LinkedGraphNode extends TreeNode {

    private LinkedGraphNode[] links;
    private int linkCount;

    public LinkedGraphNode(int data) {
        super(data);
        linkCount=0;
        links=new LinkedGraphNode[linkCount];
    }

    public void connectLink(TreeNode node){
        LinkedGraphNode[] newLink=new LinkedGraphNode[++linkCount];
        System.arraycopy(links,0,newLink,0,links.length);
        links=newLink;
    }
}
