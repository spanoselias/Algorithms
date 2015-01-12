package Challenges.ArraysAndSorting;
/**
 * Created by Elia
 *
 */
import java.util.*;

public class arraySortingChallenge4 {
    public static void main(String [] args)
    {
        Scanner keyboard=new Scanner(System.in);
        int[] noArray =new int[1000];

        int n,v,indexNo=0;

        System.out.println("Give the number that you want to search: ");
        v=keyboard.nextInt();

        System.out.println("Give the size of the array: ");
        n=keyboard.nextInt();

        for (int i=0; i<n; i++)
        {
            System.out.println("Give a number at position " + i + ":");
            noArray[i]=keyboard.nextInt();
        }

        for (int i=0; i<n; i++) {

            System.out.print(" " + noArray[i]);
        }

        for (int i=0; i<n; i++) {

        if(v==noArray[i]){indexNo=i; break;}
        }

        System.out.println("\n" + "The number is in position: " + indexNo);

    }
}
