package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 12/26/2014.
 */
import java.util.*;
import java.math.*;

public class GraphSearch {

   public void bfs(Graph mygraph,int s)
   {

       int size=mygraph.getSize();
       boolean visited[]=new boolean[size+1];
       Queue<Integer> myQueue=new LinkedList<Integer>();
       int prev[]=new int[size+1];
       for(int i=0; i< prev.length; i++){prev[i]=-1;}

       int level=1;
       for(int i=0; i<=size; i++ ){visited[i]=false;}


       myQueue.add(s);
       visited[s]=true ;

       while(!myQueue.isEmpty())
       {
           int v=myQueue.remove();
           LinkedList<Integer> edges=mygraph.getNeighbors(v);
           for(int edge:edges)
           {
                if(!visited[edge]){
                    prev[edge]=v;
                    myQueue.add(edge);
                    visited[edge]=true;
                };

           }
       }//While statment

      // System.out.println(7);
        printShortedPath(s,7,prev);

//     for(int i=0; i<prev.length; i++)
//     {
//         System.out.println("[ " + i + " ] : " + prev[i] );
//
//     }

   }//Breadth-First-Search

    public void printShortedPath(int s,int v,int prev[])
    {
        if(prev[v]!= -1){printShortedPath(s,prev[v],prev);}
        System.out.println(prev[v]);

    }//PrintShorthestPath Method

    public static void main(String [] args){



    }
}
