package Algorithms.Graphs;

/**
 * Created by Elias on 1/20/2015.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import java.util.Map;

public class Graph {

    private HashMap<String,LinkedList<Integer>> graph;

    public Graph()
    {
        graph=new HashMap<String,LinkedList<Integer>>();
    }//Constructor

    public void addVertex(String vertexIn)
    {
        graph.put(vertexIn, new LinkedList<Integer>());
    }//Add Vertex

    public void addNeighbor(int vertex1,int vertex2)
    {
        graph.get(vertex1).add(vertex2);
    }//Add neighbor method


    public LinkedList<Integer> getNeighbors(int vertex)
    {
        return graph.get(vertex);

    }//Get Neighbors method

    public static void main(String [] args)
    {


    }//Main
}//Class
