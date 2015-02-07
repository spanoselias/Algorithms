package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/2/2015.
 */
import java.util.*;
public class driver {

    public static void main(String [] args)
    {
//        PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
//
//        for(int i=10;  i>0; i--)
//        {
//            pr.add(i);
//        }
//        System.out.println(pr.poll());

         int[][] solved = { { 1, 2, 3 }, { 4, 5, 6 },
                { 7, 8, 0 } };

        Board myBoard=new Board(solved);
        System.out.println(myBoard) ;
        solved[0][0]=10;
        System.out.println(myBoard) ;
    }
}
