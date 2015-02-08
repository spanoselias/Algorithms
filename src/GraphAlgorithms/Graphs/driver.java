package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/2/2015.
 */
import java.util.*;
import java.lang.*;
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

        int[][] solved1 = { { 1, 2, 3 }, { 4, 5, 6 },
                { 8, 7, 0 } };

        int[][] solved2 = { { 2, 1, 3 }, { 4, 5, 6 },
                { 8, 0,7 } };

        Board myBoard=new Board(solved);
        Board myBoard1=new Board(solved1);
        Board myBoard2=new Board(solved2);
      //  System.out.println(myBoard) ;

        myBoard.neighbors(myBoard1,myBoard2);

        LinkedList<Board> myBoards=myBoard.neighbors(myBoard1,myBoard2);

        for(Board curBoard : myBoards)
        {
            System.out.println(curBoard);
        }




    }
}
