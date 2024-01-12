/*
function overloading :
*/
import java.util.Scanner;

class Areas
{
    public void area(double x)
    {
        double a=3.14*x*x;
        System.out.println("Area of circle is "+a);
    }
    public void area(int len,int brd)
    {
        int a=len*brd;
        System.out.println("Area of rectangle is "+a);
    }
    public void area(double base,double height)
    {
        double a=0.5*base*height;
        System.out.println("Area of triangle is "+a);
    }
}
class FunctionOverloading
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length and bredth");
        int l=s.nextInt();
        int b=s.nextInt();
        Areas ar=new Areas();
        ar.area(l,b);
        System.out.println("Enter base and height");
        double bs=s.nextDouble();
        double h=s.nextDouble();
        ar.area(bs,h);
        // System.out.println("Enter radius");
        // int r=s.nextInt();
        ar.area(6.7f);
   }
}

// b - 2  RUns fine
// c - 7 Compile time error
// a - 0 Run time error
// d - 0 None

// c - 1
// b - 7
// a - 1

// a - 0
// b - 9
// c - 0
// d - 0