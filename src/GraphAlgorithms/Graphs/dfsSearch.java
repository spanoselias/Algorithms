package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 1/22/2015.
 */
import java.util.*;
public class dfsSearch {

    boolean marked[];
    private int edgeTo[];
    Graph myGraph;

    dfsSearch(Graph g)
    {
        marked=new boolean[g.getSize()];
        for(int i=0; i<marked.length; i++)marked[i]=false;
        myGraph=g;
    }//Constructor

    public void dfs(int s)
    {
        System.out.println(s);
        marked[s]=true;
        LinkedList<Integer> edges=myGraph.getNeighbors(s);
        for(int edge : edges)
        {
            if (!marked[edge])
            {

                dfs(edge);
            }

        }

    }


}
