import java.util.Scanner;

class Person {
  protected String fname, lname;

  public Person() {
    // this always points to current object
    // this is automatically injected by java
    this.fname="Abc";
    lname="Pqr";
  } 

  public Person(String fname, String lname) {
    this.fname=fname;
    this.lname=lname;
  }

  public void printPerson() {
    System.out.println("Fname is: "+fname+", Lname is: "+lname);
  }
}

class Teacher extends Person {
  protected String department;
  protected int numberOfExperience;

  public Teacher() {
    super();
    department="CSE";
    numberOfExperience=6;
  }

  public Teacher(String fname, String lname, String department, int numberOfExperience) {
    super(fname, lname);
    this.department=department;
    this.numberOfExperience=numberOfExperience;
  }

  public void printTeacher() {
    printPerson();
    System.out.println("Dept: "+this.department+", Exp: "+this.numberOfExperience);
  }
}

class Hod extends Teacher {
  private String qualification;

  public Hod() {
    super();
    qualification="PHD";
  }

  public Hod(String fname, String lname, String department, int numberOfExperience, String qualification) {
    super(fname, lname, department, numberOfExperience);
    this.qualification=qualification;
  }

  public void print() { // public print(Hod this)
    printPerson();
    printTeacher();
    System.out.println("First name: "+fname);
    System.out.println("Qualification: "+qualification);
  }
}

public class MultiLevelExample {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Hod hod1 = new Hod();
    hod1.print();

    System.out.println("Enter fname: ");
    String fname=sc.next();

    System.out.println("Enter lname: ");
    String lname=sc.next();
    
    System.out.println("Enter department: ");
    String department=sc.next();
    
    System.out.println("Enter number of years of experience: ");
    int exp=sc.nextInt();
    
    System.out.println("Enter designation: ");
    String designation=sc.next();

    Hod hod2=new Hod(fname, lname, department, exp, designation);

  
    hod2.print(); // print(hod2)
    
  }
}