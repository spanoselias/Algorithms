package Algorithms;

import java.util.Random;
import java.util.Scanner;


/**
 * Created by Elias on 1/12/2015.
 */
public class FindIndexOfPeak {
    public static void FindPeak(int[] Numbers,int n)
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

    }
}
