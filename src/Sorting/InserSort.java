package Sorting;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by Elias on 1/12/2015.
 */
public class InserSort {

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

        int size = randomGenerator.nextInt(1000);
        int a[]=new int [size];
        for(int j=0; j<size; j++) {
            a[j]=randomGenerator.nextInt(10000);
        }//For J

        Insertionsort(a);

        for(int j=0; j<5; j++) {
            System.out.print(a[j]+ " ,");
        }//For J
    }
}
