package Sorting;

import java.util.Scanner;

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
            Numbers[i]=key;
        }//For Statment
    }//InsertionSort Method

    public static void main(String [] args){

        Scanner keyboard=new Scanner(System.in);
        int a[]=new int [5];
        for(int j=0; j<4; j++) {

            System.out.println("Give a Number:");
            a[j]=keyboard.nextInt();
        }//For J

        Insertionsort(a);

        for(int j=0; j<5; j++) {
            System.out.println(a[j]);
        }//For J
    }
}
