package Algorithms.Graphs;

/**
 * Created by Elias on 1/20/2015.
 */
import java.lang.reflect.Array;
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

        String line=null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader("graphdata.txt");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            "graphdata.txt" + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + "graphdata.txt" + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }


        Graph myGraph=new Graph();
        myGraph.addVertex("1");
        myGraph.addVertex("2");
        myGraph.addVertex("3");

        myGraph.addEdge("1", "2");
        myGraph.addEdge("1", "3");
        myGraph.addEdge("2", "3");
        myGraph.addEdge("2", "4");
        myGraph.addEdge("3", "4");

       // LinkedList<String> edge=myGraph.getNeighbors("1");

        //System.out.println(Arrays.toString(edge.toArray()));

        myGraph.printGraph();

    }//Main
}//Class
