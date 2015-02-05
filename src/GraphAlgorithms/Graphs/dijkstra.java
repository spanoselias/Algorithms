package GraphAlgorithms.Graphs;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Elias on 2/2/2015.
 */
public class dijkstra {

    public static class Node
    {
        String vertex;
        int weight;

        public Node(String vertexIn,int weightIn)
        {
            this.vertex=vertexIn;
            this.weight=weightIn;
        }

        @Override public String toString(){return ""+ weight;}
    }



    public static void main(String [] args)
    {
        PriorityQueue<Node> priorityq=new PriorityQueue<Node>(11, new Comparator<Node>() {
            @Override
            public int compare(Node node1, Node node2) {
                return node1.weight<node2.weight?-1: node1.weight==node2.weight ? 0:1;
            }
        });


        Node node1=new Node("a",5);
        Node node2=new Node("a",3);
        Node node4=new Node("a",7);
        Node node3=new Node("a",1);

        priorityq.add(node1);
        priorityq.add(node2);
        priorityq.add(node4);
        priorityq.add(node3);
        Node test=priorityq.remove();

        System.out.println(test.weight);
    }//Main

}//Class
