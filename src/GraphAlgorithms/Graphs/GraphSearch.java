package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 12/26/2014.
 */
import java.util.*;

public class GraphSearch {

   public Queue<Integer> bfs(Graph mygraph,int s)
   {

       int size=mygraph.getSize();
       boolean visited[]=new boolean[size];
       Queue<Integer> myQueue=new LinkedList<Integer>();
       Queue<Integer> path=new LinkedList<Integer>();

       int level=1;

       for(int i=0; i<size; i++ ){visited[i]=false;}


       myQueue.add(s);
       path.add(s);
       visited[s]=true ;

       while(!myQueue.isEmpty())
       {
           int v=myQueue.remove();
           LinkedList<Integer> edges=mygraph.getNeighbors(v);
           for(int edge:edges)
           {
                if(!visited[edge]){
                    path.add(edge);
                    myQueue.add(edge);
                    visited[edge]=true;
                };

           }


       }//While statment


    return path;

   }//Breadth-First-Search



    public static void main(String [] args){



    }
}
