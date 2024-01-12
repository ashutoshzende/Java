/*
inheritance :
*/
// package
import java.util.Scanner;
// base/parent/super
class Person
{
   protected String fname;
   private String lname;
   protected Scanner x=new Scanner(System.in);
   public void getPerson()
   {
      System.out.println("Enter first name ");
      fname=x.next(); // fname="jitesh"
      System.out.println("Enter last name ");
      lname=x.next();
   }
   public void print()
   {
      System.out.println("Name is "+fname+" "+lname);
   }
}
// derived/sub/child
class Teacher extends Person
{
     private String sub;
     private int years;
     public void getTeacher() // getTeacher(Teacher this)
     {
         getPerson(); // this.getPerson()
         System.out.println("Enter subject name ");
         sub=x.next(); // nextLine
         System.out.println("Enter number of years worked");
         years=x.nextInt();  // nextFloat, nextDouble
     }
     public void print()
     {
        super.print();
        System.out.println(fname+" has subject "+sub+" and number of years worked "+years);
     }
}

// main
class InheritanceExample
{
    public static void main(String args[])
    {
        Teacher t=new Teacher();
        // t.getPerson();
        t.getTeacher();
        t.print();
   }
}
       