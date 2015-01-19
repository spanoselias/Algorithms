package Algorithms;

import java.util.Scanner;
import java.util.Random;
/**
 * Created by Elias on 1/12/2015.
 */
public class Find1DIndexOfPeak {
    public static int FindPeak(int[] A,int startPos,int endPos)
    {
        int curPos=startPos+(endPos-startPos)/2;

        if(curPos-1 >=0 && A[curPos] < A[curPos-1])
        {
           return FindPeak(A,startPos,curPos-1);
        }//If statment
        else if (curPos+1 < A.length && A[curPos]<= A[curPos+1]){
         return FindPeak(A,curPos+1,endPos);
        }
        else
        {
            return curPos;
        }
    }//FindPeak Method

    public static void main(String [] args){
        Scanner keyboard=new Scanner(System.in);
        Random randomGenerator = new Random();

        int size = randomGenerator.nextInt(100000000);
        int elements[]=new int [size];

        for(int j=0; j<elements.length; j++) {
            elements[j]=randomGenerator.nextInt(1000000);
        }//For J

        int answer=FindPeak(elements,0, elements.length);

        System.out.println(answer);
    }
}
