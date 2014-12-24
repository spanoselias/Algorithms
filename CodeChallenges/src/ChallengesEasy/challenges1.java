package ChallengesEasy;

import java.util.*;


//Challenge1: For this challenge you will be reversing a string.

import java.util.*;
import java.io.*;

class Function {
    String FirstReverse(String str) {

        String invString="";
        for(int i=str.length()-1; i>=0; i--)
        {
            invString=invString + String.valueOf(str.charAt(i));

        }

        str=invString;
        return str;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.FirstReverse(s.nextLine()));
    }

}

