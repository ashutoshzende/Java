import java.util.Scanner;
import java.util.*;

class info {
    String fnm, lnm;
    int rollno, maths, english, biology, physics, chemistry, total;
    float per;
    Scanner sc = new Scanner(System.in);

    public void get() {
        System.out.println("Enter First Name:");
        fnm = sc.nextLine();
        System.out.println("Enter Last Name:");
        lnm = sc.nextLine();
        System.out.println("Enter Your RollNo.");
        rollno = sc.nextInt();
        System.out.println("Enter Your Maths Mark:");
        maths = sc.nextInt();
        System.out.println("Enter Your English Mark");
        english = sc.nextInt();
        System.out.println("Enter Your Chemistry Mark");
        chemistry = sc.nextInt();
        System.out.println("Enter Your Physics Mark");
        physics = sc.nextInt();
        System.out.println("Enter Your Biology ");
        biology = sc.nextInt();
    }

    public void set() {
        System.out.println("First name:" + fnm);
        System.out.println("Last name:" + lnm);
        System.out.println("Roll Number:" + rollno);
        System.out.println("My Marks in Maths Subject:" + maths);
        System.out.println("My Marks in English Subject:" + english);
        System.out.println("My Marks in Biology  Subject:" + biology);
        System.out.println("My Marks in Physics  Subject:" + physics);
        System.out.println("My Marks in Chemistry  Subject:" + chemistry);
        System.out.println("Obtained marks are:" + total);
        System.out.println("My Percentage is:" + per);
    }

    public void cal() {
        total = maths + english + biology + physics + chemistry;
        per=(total/5);

    }

}

public class student {

    public static void main(String[] args) {
        System.out.println("***********Enter Your Details Here************");
        info i=new info();
        info i1=new info();
       

        i.get();
        i.cal();
      

        System.out.println("---------------------------");

        i1.get();
        i1.cal();

        System.out.println("---------------------------");

        System.out.println("************Detail info of STUDENT************");
i.set();
System.out.println("---------------------------");
i1.set();

      


    }
}
