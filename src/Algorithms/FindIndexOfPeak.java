package Algorithms;

import java.util.Random;
import java.util.Scanner;


/**
 * Created by Elias on 1/12/2015.
 */
public class FindIndexOfPeak {
    public static int FindPeak(int[] A,int n)
    {
        if(A[n/2]>= A[(n/2)-1] && A[n/2]>=A[(n/2)+1] )
        {
            return n/2;
        }//If statment
        else if (A[n/2]<= A[(n/2)-1]{
         return FindPeak(A,(n/2)-1);
        }
        else if (A[n/2]<= A[(n/2)+1)
         {
             return FindPeak(A,(n/2)+1);
         }

    }//FindPeak Method

    public static void main(String [] args){

        Scanner keyboard=new Scanner(System.in);


    }
}