package Challenges.ArraysAndSorting.Graphs;

/**
 * Created by Elias on 12/26/2014.
 */
import java.util.*;
public class DFS_NonRecursive {

    public static boolean[][] createGraph(int N)
    {
        Scanner keyboard=new Scanner(System.in);

        boolean[][] graph=new boolean[N][N];

        for(int i=0; i< N;i++ ){
            for(int j=0; j<N; j++) {
                System.out.println("Give true(False if is not) there are connection between Vertex" +"("+ i +","+ j+"):");
                graph[i][j]=keyboard.nextBoolean();
                }//For J
            }//For I

        return graph;
    }//Function CreateGraph


    public static void main(String [] args){

        Scanner keyboard=new Scanner(System.in);
        System.out.println("Give the dimension of tha array:");
        int N=keyboard.nextInt();

       boolean graph[][]=createGraph(N);



    }
}
