package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/7/2015.
 */
import com.sun.xml.internal.ws.api.ImpliesWebServiceFeature;

import javax.naming.directory.SearchControls;
import java.lang.*;
import java.util.LinkedList;
import java.util.Stack;

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

    public LinkedList<puzzleNode> neighbors()
    {
       LinkedList<puzzleNode> listBoards= new LinkedList<puzzleNode>();
       int zeroRow=-1;
       int zeroCol=-1;
       int size=board[0].length;

        for(int i=0; i<board[0].length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                if (board[i][j] == 0) {
                    zeroRow = i;
                    zeroCol = j;
                }
            }
        }

         if(zeroCol-1 >= 0)
            {
                puzzleNode neighborNode=new puzzleNode(this.board);
                swap(neighborNode,zeroRow,zeroCol,zeroRow,zeroCol-1);
                neighborNode.parent=this.board;
                listBoards.add(neighborNode);
            }

            if(zeroCol+1 < board[0].length){
                puzzleNode neighborNode=new puzzleNode(this.board);
                swap(neighborNode,zeroRow,zeroCol,zeroRow,zeroCol+1);
                neighborNode.parent=this.board;
                listBoards.add(neighborNode);
            }

            if(zeroRow-1 >=0){
                puzzleNode neighborNode=new puzzleNode(this.board);
                swap(neighborNode,zeroRow,zeroCol,zeroRow-1,zeroCol);
                neighborNode.parent=this.board;
                listBoards.add(neighborNode);
            }

            if(zeroRow+1 <=board[0].length)
            {
                puzzleNode neighborNode=new puzzleNode(this.board);
                swap(neighborNode,zeroRow,zeroCol,zeroRow+1,zeroCol);
                neighborNode.parent=this.board;
                listBoards.add(neighborNode);
            }
        return listBoards;

    }//Function neighbors

    private void swap(puzzleNode boardIn,int zeroRowIn, int zeroColIn,int newRow, int newCol)
    {
        int curNo=boardIn.puzzleBoard.board[newRow][newCol];

        boardIn.puzzleBoard.board[newRow][newCol]=0;
        boardIn.puzzleBoard.board[zeroRowIn][zeroColIn]=curNo;
    }//Function Swap





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








