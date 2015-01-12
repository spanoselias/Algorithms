package Sorting;

import java.util.Scanner;

/**
 * Created by Elias on 1/12/2015.
 */
public class InserSort {

    public static void Insertionsort(int[] Numbers)
    {
        int j=0,key=0;
        for (int i=0; i<Numbers.length; i++)
        {
            j=i+1;
            key=Numbers[j];

            while(i >-1 && Numbers[j]>key)
            {
                Numbers[i+1]=Numbers[i];
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
