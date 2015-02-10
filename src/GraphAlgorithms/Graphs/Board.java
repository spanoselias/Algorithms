package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/7/2015.
 */

import java.lang.*;
import java.util.LinkedList;

public class Board {
     int board[][];

    Board(int tiles[][])
    {
        int size=tiles[0].length;
        board=new int[size][size];

        for(int i=0; i<tiles[0].length; i++) {
            System.arraycopy(tiles[i], 0, this.board[i], 0, size);
        }
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
                 int cordX=(curValue-1)% board[0].length;
                 int cordY=(curValue-1)/ board[0].length;

                 totalManhattan += Math.abs(i - cordY)+ Math.abs(j-cordX);
             }//If is not the space
         }//For j
     }//For i
     return totalManhattan;
 }
       public boolean isGoal(){

        return manhattan()==0?true:false;
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




    public  String toString(){
        String repres="";
       for (int i = 0; i < board[0].length; i++) {
           for (int j = 0; j < board[1].length; j++) {
              repres +=(board[i][j]+ " ");
           }
           repres +="\n";
             }
           return repres;
   }//toString Function
 }








