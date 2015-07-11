package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 1/25/2015.
 */
public class runGraph {
    public static void  main (String[] args){

        Graph myGraph=new Graph();

        readTxt readgraph=new readTxt("mygraph.txt");
        readgraph.readGraphTxt(myGraph);
//         myGraph.addEdge(0,1);
//         myGraph.addEdge(1,2);
//         myGraph.addEdge(1,3);
//         myGraph.addEdge(2,3);
//         myGraph.addEdge(3,4);

        // myGraph.printGraph();
        //BfsSearch search=new BfsSearch();

        dfsSearch dfs=new dfsSearch(myGraph);
        dfs.dfs(0);
        //Queue<Integer>path=new LinkedList<Integer>();
        //search.bfs(myGraph,1);


        //   System.out.println(path);
        // System.out.println(myGraph.getSize());

    }
}
