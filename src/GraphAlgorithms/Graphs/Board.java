package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/7/2015.
 */
import java.lang.*;

public class Board {
     int board[][];

    Board(int tiles[][])
    {
        board=tiles;
    }

 public int manhattan()
 {
     int totalManhattan=0;
     for(int i=0; i<board[0].length; i++)
     {
         for(int j=0; j<board[1].length; j++)
         {
             int curValue=board[i][j];
             if(curValue!=0)
             {
                 int cordX=(curValue-1)%4;
                 int cordY=(curValue-1)/4;

                 totalManhattan += Math.abs(i - cordY)+ Math.abs(j-cordX);
             }//If is not the space
         }//For j
     }//For i
     return totalManhattan;
 }


public boolean equals(Board curBoard) {

    for (int i = 0; i < board[0].length; i++) {
        for (int j = 0; j < board[1].length; j++) {
            if (board[i][j] != curBoard.board[i][j]) {
                return false;
            }
        }
    }
    return true;

}


   public String toString(){

       for (int i = 0; i < board[0].length; i++) {
           for (int j = 0; j < board[1].length; j++) {

               System.out.print(board[i][j]+ " ");
           }
           System.out.println();
             }
   }//toString Function


    }







}
