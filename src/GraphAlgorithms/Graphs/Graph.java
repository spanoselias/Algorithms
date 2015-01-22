package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 1/20/2015.
 */
import java.util.*;
import java.io.*;

public class Graph {

    private SortedMap<Integer,LinkedList<Integer>> graph;

    public Graph()
    {
        graph=new TreeMap<Integer, LinkedList<Integer>>();
    }//Constructor

    public void addVertex(int vertexIn)
    {
        graph.put(vertexIn, new LinkedList<Integer>());
    }//Add Vertex

    public void addEdge(int vertex1,int vertex2)
    {
        connectVertex(vertex1,vertex2);
        connectVertex(vertex2,vertex1);
    }//Add neighbor method

    public LinkedList<Integer> getNeighbors(int vertex)
    {
        return graph.get(vertex);

    }//Get Neighbors method


    public void connectVertex(int vertex1,int vertex2)
    {
        if(!graph.containsKey(vertex1))
        {
            graph.put(vertex1, new LinkedList<Integer>());
            graph.get(vertex1).add(vertex2);
        }
        else
            graph.get(vertex1).add(vertex2);

    }//Connect Vertex


    public int getSize()
    {
        return graph.size();
    }//Get size method

    public  int degree(int vertex)
    {
        int degree=0;
        LinkedList<Integer> edges= graph.get(vertex);
        for(Integer edge : edges)degree++;

        return degree;
    }//Calculate Degree of a Graph

    public void printGraph()
    {
        for(Map.Entry<Integer,LinkedList<Integer>> entry:graph.entrySet())
        {
            Integer vertex=entry.getKey();
            LinkedList<Integer> curEdges=entry.getValue();

            if( curEdges.size()>0)
            System.out.print(vertex + ": ");

            for(Integer edge : curEdges)
            {
                System.out.print(edge + ", ");
            }
                System.out.println();

        }//For Statment
    }//Print Graph

    public static void main(String [] args)
    {
        Graph myGraph=new Graph();

       // readTxt readgraph=new readTxt("mediumG.txt");
        //readgraph.readGraphTxt(myGraph);
        myGraph.addEdge(1,2);
        myGraph.addEdge(1,3);
        myGraph.addEdge(2,5);
        myGraph.addEdge(3,4);
        myGraph.addEdge(4,5);

        myGraph.printGraph();
      GraphSearch search=new GraphSearch();
        search.bfs(myGraph,1);
      //  System.out.println(myGraph.getSize());

    }//Main
}//Class
