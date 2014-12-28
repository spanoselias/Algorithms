package Graphs;

/**
 * Created by Elias on 12/26/2014.
 */
import java.util.*;
public class DFS_NonRecursive {

    public boolean[][] createGraph()
    {
        Scanner keyboard=new Scanner(System.in);
        int N=0;
        System.out.println("Give the dimension of tha array");
        N=keyboard.nextInt();

        boolean[][] graph=new boolean[N][N];

        for(int i=0; i< graph.length;i++ ){
            for(int j=0; i<graph.length; j++) {
                System.out.println("Give true(False if is not) there are connection between Vertex" + i + "And" + j);
                graph[i][j]=keyboard.nextBoolean();
                }//For J
            }//For I

    }//Function CreateGraph


    public static void main(String [] args){

    System.out.println("Dfs algorithm");

    }
}
