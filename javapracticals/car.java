import java.util.*;
class engine
{
String e;
int c;
public void get()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter type of engine:Petrol or Diseal");
e=s.next();
System.out.println("Enter CC of ur engine");
c=s.nextInt();
}
public void put()
{ 
System.out.println("Type of engine is:"+e);
System.out.println("CC of engine:"+c);
}
}
class tyre extends engine
{
String d,f;
public void get1()
{
Scanner s1=new Scanner(System.in);

System.out.println("Enter company of tyre:");
d=s1.next();
System.out.println("Enter type of tyre:Tube or tubeless");
f=s1.next();
}
public void put1()
{
System.out.println("Company of tyre:"+d);
System.out.println("Type of tyre:"+f);
}
}
class door extends tyre
{
String od;
int n;
public void get2()
{
Scanner s2=new Scanner(System.in);
System.out.println("Enter opening of door:");
od=s2.next();
System.out.println("Enter no of door:");
n=s2.nextInt();
}
public void put2()
{
System.out.println("Opening of door:"+od);
System.out.println("No of door:"+n);
}
}
class car
{
public static void main(String args[])
{
door d1=new door();
d1.get();
System.out.println("-------------------------------");
d1.get1();
System.out.println("-------------------------------");
d1.get2();
System.out.println("-------------------------------");
d1.put();

d1.put1();

d1.put2();
}
}
