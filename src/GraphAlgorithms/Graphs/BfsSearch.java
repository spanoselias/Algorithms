package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 12/26/2014.
 */
import java.util.*;
import java.math.*;

public class BfsSearch {
   public void bfs(Graph mygraph,int s)
   {
       int size=mygraph.getSize();
       boolean visited[]=new boolean[size+1];
       Queue<Integer> myQueue=new LinkedList<Integer>();
       int prev[]=new int[size+1];
     //  for(int i=0; i< prev.length; i++){prev[i]=-1;}

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
                }
           }
       }//While statment

      System.out.print("[ ");
       printShortedPath(s, 225, prev);
       System.out.print( 225 + "]");

//     for(int i=0; i<prev.length; i++)
//     {
//         System.out.println("[ " + i + " ] : " + prev[i] );
//
//     }

   }//Breadth-First-Search

   public void printShortedPath(int s,int v,int prev[])
    {
      //System.out.print("["+ v);
        shortedPath(s, v, prev);
        //System.out.print(" ]");

    }//PrintShorthestPath Method

    private void shortedPath(int s,int v,int prev[])
    {
        if(prev[v]!= s){printShortedPath(s,prev[v],prev);}
        System.out.print(prev[v] + " , ");

    }//PrintShorthestPath Method

    public static void main(String [] args){



    }
}
