package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/8/2015.
 */
public class puzzleNode {

        Board puzzleBoard;
        int h;
        int g;
        int f;
        Board parent;

        puzzleNode(int [][] boardIn)
        {
            int size=boardIn[0].length;
            puzzleBoard=new Board(boardIn);

            for(int i=0; i<boardIn[0].length; i++) {
                System.arraycopy(boardIn[i], 0, this.puzzleBoard.board[i], 0, size);
            }
        }
       puzzleNode(){
           puzzleBoard=null;
            h=0;
            g=0;
            parent=null;
        }

        puzzleNode(int [][] curboard,int h,int g,Board curparent)
        {
            this.puzzleBoard=new Board(curboard);
            this.h=h;
            this.g=g;
            this.parent=curparent;
        }public  String toString(){
        String repres="";
        for (int i = 0; i < puzzleBoard.board[0].length; i++) {
            for (int j = 0; j < puzzleBoard.board[1].length; j++) {
                repres +=(puzzleBoard.board[i][j]+ " ");
            }
            repres +="\n";
        }
        return repres;
    }//toString Function




}
