package graph;

import base.GraphSearch;


public class Graph {

    private LinkedGraphNode currentNode;
    private GraphSearch<Graph,LinkedGraphNode> DFS;
    private GraphSearch<Graph,LinkedGraphNode> BFS;


    public Graph(int data) {
        currentNode=new LinkedGraphNode(data);

        this.DFS = new GraphSearch<Graph, LinkedGraphNode>() {
            @Override
            public LinkedGraphNode[] search(Graph graph, LinkedGraphNode node) {
                //TODO implement DFS
                return new LinkedGraphNode[0];
            }

            @Override
            public void searchAll(Graph graph) {
                //TODO implement DFSAll
            }
        };


        this.BFS = new GraphSearch<Graph, LinkedGraphNode>() {
            @Override
            public LinkedGraphNode[] search(Graph graph, LinkedGraphNode node) {
                //TODO implement BFS
                return new LinkedGraphNode[0];
            }

            @Override
            public void searchAll(Graph graph) {
                //TODO implement BFSAll
            }
        };
    }


    public LinkedGraphNode getCurrentNode() {
        return currentNode;
    }


        //DFS result in String array
    public String[] dfs(LinkedGraphNode node){
        LinkedGraphNode[] result;
        result=DFS.search(this,node);

        String[] output=new String[result.length];

        for (int i = 0; i < result.length; i++) {
            output[i]=String.valueOf(result[i].getData());
        }
        return output;
    }

        //DFS-ALL result print
    public void dfsAll(){
        DFS.searchAll(this);
    }

        //BFS result in String array
    public String[] bfs(LinkedGraphNode node){
        LinkedGraphNode[] result;
        result=BFS.search(this,node);

        String[] output=new String[result.length];

        for (int i = 0; i < result.length; i++) {
            output[i]=String.valueOf(result[i].getData());
        }
        return output;
    }

        //BFS-ALL result print
    public void bfsAll(){
        BFS.searchAll(this);
    }
}
