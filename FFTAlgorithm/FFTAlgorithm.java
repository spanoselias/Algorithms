/////////////////////////////////////////
//         FFT Algorithm
////////////////////////////////////////

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.io.*;

public class FFTAlgorithm {

    public static Complex MultyComplex(Complex complex1,Complex complex2){

        double real=(complex1.real * complex2.real) - (complex1.imaginary * complex2.imaginary);
        double imagin=(complex1.real * complex2.imaginary) + (complex1.imaginary * complex2.real);

        return new Complex (real,imagin);
    }//Function Complex

    public static Complex addComplex(Complex complex1,Complex complex2){
        double real=(complex1.real + complex2.real);
        double imagin=complex1.imaginary + complex2.imaginary;

        return new Complex(real,imagin);
    } //addCompelx

    public static Complex subComplex(Complex complex1,Complex complex2){
        double real=(complex1.real - complex2.real);
        double imagin=complex1.imaginary - complex2.imaginary;
        return new Complex(real,imagin);

    } //addCompelx

/////////////////////////////////////////
//         ALGORITHM
////////////////////////////////////////
private static Complex[] ifft(Complex coefficentsIn[]){
    int SIZE=coefficentsIn.length;
    Complex negative=new Complex((1.0/SIZE),0);
    Complex C[]=new Complex[SIZE];

    for(int i=0; i<SIZE; i++){C[i]=new Complex(coefficentsIn[i].real,-1.0 * coefficentsIn[i].imaginary);}

    Complex cinverse[]=fft(C, coefficentsIn.length);


    for(int i=0; i<SIZE; i++){
           // C[i]=new Complex(0,0);
            //C[i]=new Complex(C[i].real * (1/SIZE),C[i].real * (1/SIZE));
            //cinverse[i]=cinverse[i].multiNum(1.0/SIZE);
              cinverse[i]=MultyComplex(cinverse[i],negative);
    }//For statment

    return cinverse;
}//Function ifft





public static Complex[] multiplication(Complex polyAIn[], Complex polyBIn[]){
    int SIZE=polyAIn.length;

    Complex polyC[]=new Complex[SIZE];

        for(int i=0; i<SIZE; i++){
              //  polyC[i]=new Complex(0,0);
                  polyC[i]=MultyComplex(polyAIn[i],polyBIn[i]);
                //polyC[i]=polyAIn[i].multiplyComplexNumber(polyBIn[i]);
        }//For statment

        return polyC;
}//Function multiplication

/////////////////////////////////////////
//         RECURSION DIVIDED
////////////////////////////////////////
public static Complex[] fft(Complex coefficentsIn[],int SIZE){

        //Base Case of the Recursion
        if(SIZE==1){return coefficentsIn;}

        Complex W=new Complex(1.0,0.0);
        Complex evenArray[],oddArray[];

        evenArray=CalculateEven(coefficentsIn);
        Complex even[]=fft(evenArray,SIZE/2);

        oddArray=CalculateOdd(coefficentsIn);
        Complex odd[]=fft(oddArray,SIZE/2);


        Complex A[]=new Complex[SIZE];

        for(int j=0; j < (SIZE/2); j++){
            A[j]=addComplex(even[j], MultyComplex(W, odd[j]));
            A[j + SIZE/2] =subComplex(even[j], MultyComplex(W, odd[j]));
            W =MultyComplex(W,UnityRoot(SIZE));
        }//For i

        return A;
 }//Function RecursionDivide


/////////////////////////////////////////
//       FUNCTION CALCULATE EVENs
////////////////////////////////////////
public static Complex[] CalculateEven(Complex coefficentsIn[]){
     int SIZE=coefficentsIn.length;

     Complex [] evenPositions=new Complex[SIZE/2];
     for(int i=0; i<SIZE/2; i++){
         evenPositions[i]=coefficentsIn[2*i];
     }//For Statment

  return evenPositions;
 }//Function Calculate Evens posistion


/////////////////////////////////////////
//       FUNCTION CALCULATE ODDs
////////////////////////////////////////
public static Complex[] CalculateOdd(Complex coefficentsIn[]){
        int size=coefficentsIn.length;

        Complex [] oddPositions=new Complex[size/2];
        for(int i=0; i<size/2; i++){
            oddPositions[i]=coefficentsIn[2*i+1];
        }//For Statment

     return oddPositions;
}//Function Calculate Evens posistion

/////////////////////////////////////////
//       FUNCTION CALCULATE Unity Roots
////////////////////////////////////////
public static Complex[] CalculateUnityRoots(int sizeIn){
      final double TWO_PI=360;
      int SIZE=sizeIn * 2;
      Complex[] W=new Complex[sizeIn * 2];

        for(int j=0; j<SIZE; j++)
        {
            W[j]=new Complex();

            BigDecimal real = new BigDecimal(Math.cos(Math.toRadians((TWO_PI*j)/SIZE)));
            real= real.setScale(2, RoundingMode.HALF_UP);
            W[j].real=real.doubleValue();

            BigDecimal imagin = new BigDecimal(Math.sin(Math.toRadians((TWO_PI * j) / SIZE)));
            imagin=imagin.setScale(2, RoundingMode.HALF_UP);
            W[j].imaginary =imagin.doubleValue();
        }//For Statment

    return W;
}//Function CalculateUnityRoots

  /*
public static Complex UnityRoot(int SIZE){
        final double TWO_PI=360;
        Complex unityRoot=new Complex();

        BigDecimal real = new BigDecimal(Math.cos(Math.toRadians((TWO_PI)/SIZE)));
        real= real.setScale(2, RoundingMode.HALF_UP);
        unityRoot.real=real.doubleValue();

        BigDecimal imagin = new BigDecimal(Math.sin(Math.toRadians((TWO_PI) / SIZE)));
        imagin=imagin.setScale(2, RoundingMode.HALF_UP);
        unityRoot.imaginary =imagin.doubleValue();

        return  unityRoot;

    }//Function UnityRoot
    */

public static Complex NegativeUnityRoot(int SIZE){
        final double TWO_PI=360;
        Complex unityRoot=new Complex();

        BigDecimal real = new BigDecimal(Math.cos(Math.toRadians((TWO_PI)/SIZE)));
        real= real.setScale(2, RoundingMode.HALF_UP);
        unityRoot.real=real.doubleValue();

        BigDecimal imagin = new BigDecimal(Math.sin(Math.toRadians((TWO_PI) / SIZE)));
        imagin=imagin.setScale(2, RoundingMode.HALF_UP);
        unityRoot.imaginary =-imagin.doubleValue();

        return  unityRoot;

    }//Function UnityRoot

public static Complex UnityRoot(int N)
{
    Complex unityRoot=new Complex();

    unityRoot.real=Math.cos((-2 * Math.PI) / N);
    unityRoot.imaginary=Math.sin((-2 * Math.PI)/N);

    return  unityRoot;

}//Function UnityRoot

public static void generatePolynomials(int startIn,int max2power,int size) throws IOException {

   int N[]=new int[max2power];

    N[0]=2;
    for(int i=1; i<N.length;i++){
        N[i]=N[i-1] + N[i-1];

   }//Calculate all the number that is a power of two


    String path="input.txt";
    Random randomGenerator = new Random();
    Random numbers = new Random();

    try {
            FileWriter filewriter=new FileWriter(path);

            BufferedWriter bufferwriter=new BufferedWriter(filewriter);


        for(int h=startIn; h<N.length; h++) { //Go throuh all the size of power of 2
            for (int g = 0; g < size; g++) {

                // int n = randomGenerator.nextInt(10);//Generate the size of the polynimial
                bufferwriter.write(N[h] + ",(");

                for (int i = 0; i < N[h]; i++) {
                    int num = (randomGenerator.nextInt(65536)-32768);
                    bufferwriter.write(String.valueOf(num));
                    if (i != N[h] - 1) {
                        bufferwriter.write(",");
                    }//If the polynomial has not finish
                }//For i
                bufferwriter.write(" )");


                bufferwriter.write("(");
                for (int j = 0; j < N[h]; j++) {

                    int num = (randomGenerator.nextInt(65536)-32768);
                    bufferwriter.write(String.valueOf(num));
                    if (j != N[h] - 1) {
                        bufferwriter.write(",");
                    }//If the polynomial has not finish
                }//For j
                bufferwriter.write(" )");

                bufferwriter.write(String.format("%n"));//New line

            }//For g statment
        }//For h statment
                bufferwriter.close();
        }//Try

            catch(IOException
        ex) {
                System.out.println(
                        "Error writing to file '"
                                + path + "'");
            }

}//Function generatePolynomials

public static void readPolyTxt(String locationPath) throws IOException {


    int counter=1;
    String line;
    try {
        // FileReader reads text files in the default encoding.
        FileReader fileReader =
                new FileReader(locationPath);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader =
                new BufferedReader(fileReader);


        String path="result.txt";
        FileWriter filewriter=new FileWriter(path);
        BufferedWriter bufferwriter=new BufferedWriter(filewriter);

        String pathTime="benchmark.txt";
        FileWriter filewriter2=new FileWriter(pathTime);
        BufferedWriter bufferwriter2=new BufferedWriter(filewriter2);

        while((line = bufferedReader.readLine()) != null) {
            String[] character = line.trim().split("\\(");

            String SIZETOKEN[] = (character[0].trim().split(","));
            int SIZE= Integer.parseInt(SIZETOKEN[0]);

            String[] characterPolyASplit = character[1].trim().split("\\)");
            String[] characterPolyA = characterPolyASplit[0].trim().split(",");

            String[] characterPolyBSplit = character[2].trim().split("\\)");
            String[] characterPolyB = characterPolyBSplit[0].trim().split(",");


            Complex polyA[]=new Complex[SIZE * 2];
            Complex polyB[]=new Complex[SIZE * 2];

            //Check if the size is correct in split array
            int checkSize=characterPolyA.length;
                if(checkSize !=SIZE){
                    System.out.println("there is a problem with size of the polynomial");
                }//If statment

            for (int i=0; i<SIZE; i++){
                polyA[i]=new Complex(Double.parseDouble(characterPolyA[i]),0);
                polyB[i]=new Complex(Double.parseDouble(characterPolyB[i]),0);
            }//For int i


            /***************************************************************************************************/
            for(int i=SIZE; i<SIZE * 2 ; i++){
                polyA[i]=new Complex(0,0);
                polyB[i]=new Complex(0,0);
            }// padding with zero numbers      ;

            long startTime=0,endTime=0,duration=0,totalDuration=0;

           // startTime = System.currentTimeMillis();//Start timer
            startTime = System.nanoTime();

            Complex result[]=ifft(multiplication(fft(polyA, polyA.length), fft(polyB, polyB.length)));


            endTime = System.nanoTime();
            duration += ((endTime - startTime));
            ++counter;



            if(counter==20){

                bufferwriter2.write(SIZE + ",  " + (duration/20));
                bufferwriter2.write(String.format("%n"));//New line
                counter=1;
                duration=0;
            }//If statment


            /**************************************************************************************************/
               //Write the answer of polynomial


                bufferwriter.write("(");
                for(int i=0; i<result.length -1; i++){

                    BigDecimal round = new BigDecimal(result[i].real);

                    bufferwriter.write(String.valueOf(round.setScale(2,round.ROUND_HALF_UP).intValue()));
                        if(result.length-2 > i){bufferwriter.write(",");}
                }//For int i

                bufferwriter.write(")");
                bufferwriter.write(String.format("%n"));//New line




        }//While there are polynomials

        bufferwriter2.close();
        bufferwriter.close();
        bufferedReader.close();
    }
    catch(FileNotFoundException ex) {
        System.out.println(
                "Unable to open file '" +
                        locationPath + "'");
    }//Catch statment

}//function readPolyTxt

/////////////////////////////////////////
//          MAIN
////////////////////////////////////////
public static void main(String[] args) throws IOException {


          //  generatePolynomials(0,18,20);
          readPolyTxt("input.txt");


    }//Main

}//Class
