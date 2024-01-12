/*
inheritance :
*/
import java.util.Scanner;
class Person
{
   protected String fname;
   private String lname;
   public Person()
   {
   }
   public Person(String fname,String lname)
   {
        this.fname=fname;
        this.lname=lname;
   }
   
   public void print()
   {
      System.out.println("Name is "+fname+" "+lname);
   }
}
class Teacher extends Person
{
     private String sub;
     private int years;
     public Teacher()
     {
     }
     public Teacher(String fname,String lname,String sub,int years)
     {
           super(fname,lname);
           this.sub=sub;
           this.years=years;
     }
     public void print()
     {
        super.print();
        System.out.println(fname+" has subject "+sub+" and number of years worked "+years);
     }
}
class Student extends Person
{
     String branch;
     int roll_no;
     public Student()
     {
     }
     public Student(String fname,String lname,String branch,int roll_no)
     {
           super(fname,lname);
           this.branch=branch;
           this.roll_no=roll_no;
     }
     public void print()
     {
         super.print();
         System.out.println(fname+" has roll number "+roll_no+" and branch "+branch);
    }
}
class HierarchicalExampleConst
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter teacher fname,lname,subject and years worked");
        String f=x.next();
        String l=x.next();
        String s=x.next();
        int y=x.nextInt();
        Teacher t=new Teacher(f,l,s,y);        
        t.print();
        System.out.println("Enter student fname,lname,branch and roll number ");
        f=x.next();
        l=x.next();
        String b=x.next();
        int rno=x.nextInt();
        Student stud=new Student(f,l,b,rno);
        stud.print();
   }
}
       