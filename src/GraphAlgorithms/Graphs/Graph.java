package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 1/20/2015.
 */
import java.util.*;
import java.io.*;

public class Graph {

    private HashMap<String,LinkedList<String>> graph;

    public Graph()
    {
        graph=new HashMap<String,LinkedList<String>>();
    }//Constructor

    public void addVertex(String vertexIn)
    {
        graph.put(vertexIn, new LinkedList<String>());
    }//Add Vertex

    public void addEdge(String vertex1,String vertex2)
    {
       connectVertex(vertex1,vertex2);
        connectVertex(vertex2,vertex1);
    }//Add neighbor method

    public LinkedList<String> getNeighbors(String vertex)
    {
        return graph.get(vertex);

    }//Get Neighbors method


    public void connectVertex(String vertex1,String vertex2)
    {
        if(!graph.containsKey(vertex1))
        {
            graph.put(vertex1, new LinkedList<String>());
            graph.get(vertex1).add(vertex2);
        }
        else
            graph.get(vertex1).add(vertex2);

    }//Connect Vertex

    public void printGraph()
    {
        for(Map.Entry<String,LinkedList<String>> entry:graph.entrySet())
        {
            String vertex=entry.getKey();
            LinkedList<String> curEdges=entry.getValue();

            if( curEdges.size()>0)
            System.out.print(vertex + ": ");

            for(String edge : curEdges)
            {
                System.out.print(edge + ", ");
            }

                System.out.println();

        }//For Statment
    }//Print Graph

    public static void main(String [] args)
    {
        Graph myGraph=new Graph();

        readTxt readgraph=new readTxt("mediumG.txt");
        readgraph.readGraphTxt(myGraph);

    myGraph.printGraph();

    }//Main
}//Class
