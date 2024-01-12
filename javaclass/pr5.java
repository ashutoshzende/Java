class Rectangle
 {
    int l = 2, b = 4;

    public void area() 
    {

        int a = l * b;

        System.out.println("Area Of rectangle:" + a);

    }

    public void perimeter() 
    {

        int p = 2 * (l + b);
        System.out.println("Area Of Perimeter:" + p);

    }
}

public class pr5 
{
    public static void main(String[] args)
     {
        Rectangle a;
        a=new Rectangle();
        a.area();
        a.perimeter();

        
    }
}

