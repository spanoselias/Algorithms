package Sorting;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by Elias on 1/12/2015.
 */
public class InsertionSort {
    public static void Insertionsort(int[] Numbers)
    {
        int j=0,key=0;
        for (int i=1; i<Numbers.length; i++)
        {
            key=Numbers[i];
            j=i-1;

            while(j >-1 && Numbers[j]>key)
            {
                Numbers[j+1]=Numbers[j];
                j=j-1;
            }//While Statment
            Numbers[j+1]=key;
        }//For Statment
    }//InsertionSort Method

    public static void main(String [] args){

        Scanner keyboard=new Scanner(System.in);
        Random randomGenerator = new Random();

        int size = randomGenerator.nextInt(1000000);
        int a[]=new int [size];

        for(int j=0; j<a.length; j++) {
            a[j]=randomGenerator.nextInt(10000);
        }//For J
        Insertionsort(a);

        for(int j=0; j<a.length; j++) {
            if(j % 23 ==0){System.out.println();}
            System.out.print(a[j] + " ,");
        }//For J
    }
}
