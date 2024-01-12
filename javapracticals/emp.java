
import java.io.*;//Declaration of API packages 
import java.util.*;
class emp//Class Declaration
{
String fnm,lnm;//Variable declaration 
double msal=0,ysal=0,raise=0,fsal=0;
Scanner s=new Scanner(System.in);//Created object of Scanner class 
public emp()//Constructor initialization 
{
fnm="abc";//Assigned vehicles 
lnm="xyz";
msal=0.0;
}
public void get()//defined get Method
{
System.out.println("Enter first name");
fnm=s.next();
System.out.println("Enter last name");
lnm=s.next();
System.out.println("Enter monthly Salary");
msal=s.nextInt();	
}
public void set()//defined set method
{
System.out.println("First name:"+fnm);	
System.out.println("Last name:"+lnm);
System.out.println("Monthly Salary:"+msal);	
System.out.println("Yearly salary:"+ysal);
System.out.println("Salary after raise of 10%:"+raise);
System.out.println("Final salary:"+fsal);
}
public void cal()//defined cal method
{
ysal=(msal*12);
raise=(ysal*10)/100;
fsal=ysal+raise;	
}
public static void main(String args[])//Main method declaration 
{
System.out.println("Enter details of two employee"); 
emp e=new emp();//object definition and initialization 
emp e1=new emp();
emp e2=new emp();

e.get();//assignment of method to object
e.cal();
e.set();
System.out.println("---------------------------");
e1.get();

e1.cal();
System.out.println("---------------------------");
e2.get();

e2.cal();
	
System.out.println("************Detail info of employee************");
e.set();
System.out.println("---------------------------");
e1.set();
System.out.println("---------------------------");
e2.set();
}
}

