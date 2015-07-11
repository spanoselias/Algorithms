import java.math.BigDecimal;

/////////////////////////////////////////
//        COMPLEX DATA TYPE
////////////////////////////////////////
public class Complex
{
     double real=0;
     double imaginary=0;

/////////////////////////////////////////
//        CONSTRUCTOR
////////////////////////////////////////
    public Complex()
{
        this.real=0;
        this.imaginary=0;

}//Function Constructor

/////////////////////////////////////////
//        CONSTRUCTOR
////////////////////////////////////////
public Complex(double realIn,
                   double imaginaryIn)
{
        this.real = realIn;
        this.imaginary = imaginaryIn;
}//Function Constructor

/////////////////////////////////////////
//        FUNCTION GETREAL
////////////////////////////////////////
public double getReal() {
        return this.real;
}//Fucntion getReal


/////////////////////////////////////////
//        FUNCTION GETIMAGINARY
////////////////////////////////////////
public double getImaginary() {
        return this.imaginary;
}//Function getImaginary


 public Complex multiNum(double numIn) {
        return new Complex(numIn * this.real, numIn * this.imaginary);
    }


}//Complex Class