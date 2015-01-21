package Algorithms.Graphs;

/**
 * Created by Elias on 1/20/2015.
 */
import java.lang.reflect.Array;
import java.util.*;

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
        graph.get(vertex1).add(vertex2);
    }//Add neighbor method


    public LinkedList<String> getNeighbors(String vertex)
    {
        return graph.get(vertex);

    }//Get Neighbors method

    public void printGraph()
    {
        for(Map.Entry<String,LinkedList<String>> entry:graph.entrySet())
        {
            String vertex=entry.getKey();
            LinkedList<String> curEdges=entry.getValue();

            System.out.println(vertex);
            for(String edge : curEdges)
            {
                System.out.println(edge);
            }

        }//For Statment

    }//Print Graph

    public static void main(String [] args)
    {
        Graph myGraph=new Graph();
        myGraph.addVertex("1");
        myGraph.addVertex("2");

        myGraph.addEdge("1", "2");
        myGraph.addEdge("1", "3");

       // LinkedList<String> edge=myGraph.getNeighbors("1");

        //System.out.println(Arrays.toString(edge.toArray()));

        myGraph.printGraph();

    }//Main
}//Class
