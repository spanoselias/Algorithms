package Challenges.ArraysAndSorting.EasyChallenges;

import java.util.Scanner;

class EasyChallenge2 {
    int FirstFactorial(int num) {

        if(num==1)
            return 1;

        int result=num*FirstFactorial(num-1);


        return result;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        EasyChallenge2 c = new EasyChallenge2();
      //  System.out.print(c.FirstFactorial(s.nextLine()));
    }

}
