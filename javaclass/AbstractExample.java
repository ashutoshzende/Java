import java.util.Scanner;

abstract class Shape
{
    protected int x;
    protected int y;
    public Shape(int x)
    {
        this.x=x;
    }
    public Shape(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    abstract void area();
    // method body is missing
}
class Circle extends Shape
{
    
     public Circle(int r)
     {
         super(r);
     }
     public void area()
     {
         double a=3.14*x*x;
         System.out.println("Area of circle is "+a);
     }
}
class Rectangle extends Shape
{
    
      public Rectangle(int l,int b)
      {
          super(l,b);
      }
      public void area()
      {
         int a=x*y;
         System.out.println("Area of rectangle is "+a);
      }
}
class AbstractExample
{
     public static void main(String args[])
     {
         Scanner x=new Scanner(System.in);
         Shape sh;
         System.out.println("Enter radius ");
         int r=x.nextInt();
         sh=new Circle(r);
         sh.area();
         System.out.println("Enter length and breadth");
         int l=x.nextInt();
         int b=x.nextInt();
         Rectangle rect=new Rectangle(l,b);
         rect.area();
     }
}