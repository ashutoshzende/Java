// public class vehicle {

    
// }
import java.util.*;
interface vehicle
{
 String nm="Nano";
 int maxpassenger=4;
 double maxspeed=15.9;
}
interface landvehicle extends vehicle
{
 int numwheel=4;
 void drive();
void enterland();	
}
interface seavehicle extends vehicle
{
 double displ=20.0;
 void launch();
void entersea();
}
class car implements landvehicle
{
public void drive()
{
System.out.println("Name:"+nm);
System.out.println("Maxpassenger:"+maxpassenger);
System.out.println("Maxspeed:"+maxspeed);
System.out.println("No of wheels:"+numwheel);
}
public void enterland()
{
System.out.println("Entering land");
}
}
class hovecraft implements landvehicle,seavehicle
{

public void enterland()
{
System.out.println("Entering land");
}
public void entersea()
{
System.out.println("Entering sea");
}
public void drive()
{
System.out.println("Drive");
}
public void launch()
{
System.out.println("Launch");
}
}
class ship implements seavehicle
{
public void launch()
{
System.out.println("Name:"+nm);
System.out.println("Maxpassenger:"+maxpassenger);
System.out.println("Maxspeed:"+maxspeed);
System.out.println("Displacement:"+displ);
}
public void entersea()
{
System.out.println("Entering sea");
}
}

class inter
{
public static void main(String args[])
{
System.out.println("*****Land vehicle******");
landvehicle l=new car();
l.drive();
System.out.println("*****Hovercraft vehicle******");
landvehicle l1=new hovecraft();
l1.enterland();
landvehicle l2=new hovecraft();
l2.drive();
seavehicle s1=new hovecraft();
s1.entersea();
seavehicle s2=new hovecraft();
s2.launch();
System.out.println("*****Sea vehicle******");
seavehicle s=new ship();
s.launch();
}
}
