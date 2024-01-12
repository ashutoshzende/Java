import java.util.Scanner;
class NegativeValueException  extends Exception
{
    public String getMessage()
    {
         return "Number should be positive";
    }
}
class CustomExceptionExample
{
    public static void factorial(int num) throws NegativeValueException
    {
        if(num<=0)
            {
                throw new NegativeValueException();
            }
            System.out.println("Here");
            int f=1;
            for(int i=1;i<=num;i++)
            {
                 f=f*i;
            }
            System.out.println("Factorial of "+num+" is "+f);  
    }
    public static void main(String args[])
    {
         Scanner x=new Scanner(System.in);
         try
         {
            System.out.println("Enter number ");
            int num=x.nextInt();
            factorial(num);
         }
         catch(NegativeValueException e)
         {
             System.out.println(e.getMessage());
         }
     }
}