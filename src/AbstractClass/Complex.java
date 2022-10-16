package AbstractClass;

import java.util.Scanner;

class Complex{
    double real, imaginary;
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void display(){
        System.out.println("Complex Number \n Real part = " + real + "\n Imaginary part = " + imaginary  + "i");
    }
}

class Complex1 extends Complex{
    double real, imaginary;
    String result;
    public Complex1(double real, double imaginary){
        super(real, imaginary);
        this.real = real;
        this.imaginary = imaginary;
    }
    String add(){
        real += super.real;
        imaginary += super.imaginary;
        result = "Result\n real =" + real + "imaginary =" + imaginary + "i";
        return result;
    }
}

class Assignment2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary");
        Complex1 obj1 = new Complex1(sc.nextDouble(),sc.nextDouble());
        Complex obj2 = new Complex1(sc.nextDouble(), sc.nextDouble());
        obj1.display();
        System.out.println("Enter another real and imaginary");
        System.out.println(obj1.add());
    }
}