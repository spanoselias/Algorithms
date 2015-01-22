package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 12/26/2014.
 */
import java.util.*;

public class GraphSearch {

   public void bfs(Graph mygraph,int s)
   {

       int size=mygraph.getSize();
       boolean marked[]=new boolean[size];

       for(int i=0; i<size; i++ ){marked[i]=false;}

       Queue<Integer> myQueue=new LinkedList<Integer>();
       myQueue.add(s);





   }//Breadth-First-Search


    public static void main(String [] args){



    }
}
