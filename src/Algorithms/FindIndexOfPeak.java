package Algorithms;

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
        else if (A[n/2]<= A[(n/2)-1]){
         return FindPeak(A,(n/2)-1);
        }
        else if (A[n/2]<= A[(n/2)+1])
         {
             return FindPeak(A,(n/2)+1);
         }
        else return -1;

    }//FindPeak Method

    public static void main(String [] args){

        Scanner keyboard=new Scanner(System.in);
        int elements[]={2,4,1,5,7,8};
        int answer=FindPeak(elements, elements.length);

        System.out.println(answer);
    }
}
