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

         int[][] solved = { { 1, 2, 3 }, { 4, 0, 6 },
                { 7, 8, 5 } };

        int[][] solved1 = { { 1, 2, 3 }, { 4, 5, 6 },
                { 8, 7, 0 } };

        int[][] solved2 = { { 2, 1, 3 }, { 4, 5, 6 },
                { 8, 0,7 } };

        Board myBoard=new Board(solved2);
      //  System.out.println(myBoard) ;

        LinkedList<SearchNode> myBoards=myBoard.neighbors();

        for(SearchNode curBoard : myBoards)
        {
            System.out.println(curBoard);
        }


        PriorityQueue<SearchNode> openSetPriority=new PriorityQueue<SearchNode>(11, new Comparator<SearchNode>() {
            @Override
            public int compare(SearchNode node1, SearchNode node2) {
                return node1.f<node2.f?-1: node1.f ==node2.f ? 0:1;
            }
        });

        LinkedList<SearchNode> closedSet=new LinkedList<SearchNode>();

        SearchNode start=new SearchNode(myBoard.board);
        start.g=0;
        start.h =start.g + start.puzzleBoard.manhattan();

        while (!openSetPriority.isEmpty())
        {

            SearchNode curBoard=openSetPriority.remove();
            if(curBoard.puzzleBoard.isGoal()){return;}

            closedSet.add(curBoard);

            LinkedList<SearchNode> curStateBoard=curBoard.puzzleBoard.neighbors();



            for(SearchNode possibleStateBoard : curStateBoard)
            {
                if(!openSetPriority.contains(possibleStateBoard))
                {

                }
            }


        }//While openSet is not empty










    }
}
