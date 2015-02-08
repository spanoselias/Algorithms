package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/8/2015.
 */
public class puzzleNode {

        int [][] puzzleBoard;
        int h;
        int g;
        int [][] parent;

        puzzleNode(int [][] boardIn)
        {
            int size=boardIn[0].length;
            puzzleBoard=new int[size][size];

            for(int i=0; i<boardIn[0].length; i++) {
                System.arraycopy(boardIn[i], 0, this.puzzleBoard[i], 0, size);
            }
        }
       puzzleNode(){
           puzzleBoard=null;
            h=0;
            g=0;
            parent=null;
        }

        puzzleNode(int [][] curboard,int h,int g,int [][] curparent)
        {
            this.puzzleBoard=curboard;
            this.h=h;
            this.g=g;
            this.parent=curparent;
        }public  String toString(){
        String repres="";
        for (int i = 0; i < puzzleBoard[0].length; i++) {
            for (int j = 0; j < puzzleBoard[1].length; j++) {
                repres +=(puzzleBoard[i][j]+ " ");
            }
            repres +="\n";
        }
        return repres;
    }//toString Function




}
