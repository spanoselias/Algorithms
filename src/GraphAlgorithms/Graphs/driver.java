package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/2/2015.
 */
import java.util.*;
public class driver {

    public static void main(String [] args)
    {
        PriorityQueue<Integer> pr=new PriorityQueue<Integer>();

        for(int i=10;  i>0; i--)
        {
            pr.add(i);
        }
        System.out.println(pr.poll());
    }
}
