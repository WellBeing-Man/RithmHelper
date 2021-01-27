package base;


public interface GraphSearch<Graph,TreeNode>  {
    TreeNode[] search(Graph graph,TreeNode node);
    void searchAll(Graph graph);
}
