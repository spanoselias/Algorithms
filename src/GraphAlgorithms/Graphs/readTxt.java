package GraphAlgorithms.Graphs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Elias on 1/21/2015.
 */
public class readTxt {

    private String path=null;

    readTxt(String pathIn)
    {
        this.path=pathIn;
    }

   public void readGraphTxt(Graph myGraph)
    {

    String line=null;
    int counter=0;
    try {
        // FileReader reads text files in the default encoding.
        FileReader fileReader =
                new FileReader(path);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader =
                new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {

            if (counter++>100000000) break;;
            String[] edge = line.split(" ");
            if(edge.length==2 )
            {
                myGraph.addEdge(Integer.parseInt(edge[0]),Integer.parseInt(edge[1]));
//                    System.out.println(edge[0]);
//                    System.out.println(edge[1]);
            }//Check the length of a string

            else
                myGraph.addVertex(Integer.parseInt(edge[0]));
            //  System.out.println(line);

        }

        // Always close files.
        bufferedReader.close();
    }
    catch(FileNotFoundException ex) {
        System.out.println(
                "Unable to open file '" +
                        path + "'");
    }
    catch(IOException ex) {
        System.out.println(
                "Error reading file '"
                        + path + "'");
        // Or we could just do this:
        // ex.printStackTrace();
    }

    }

}//Class
