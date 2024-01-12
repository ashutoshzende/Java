
 
import java.util.*; 
interface vehicle
{     public String name="Vehicle";   
  public int maxPasenger=4;    
   public double maxSpeed=40; 
} 
interface LandVehicle extends vehicle 
{ 
    public int numWheels=4; 
    public void drive(); 
} 
interface SeaVehicle extends vehicle 
{ 
    public int displacement=2;   
      public void launch  (); 
} 
class car implements LandVehicle{    
     Scanner sc=new Scanner(System.in);  
        public void drive() 
    { 
        System.out.println("The name of the car is "+name); 
        System.out.println("The max pasenngers a car can have is  "+maxPasenger); 
        System.out.println("The max speed of a car can have is  "+maxSpeed); 
        System.out.println("The max wheels a car have is  "+numWheels); 
    } 
 } 
class HoverCraft implements LandVehicle,SeaVehicle 
{ 
    public String name="Hovercarft"; 
    public void drive() 
    { 
        System.out.println("The name of the car is "+name); 
        System.out.println("The max pasenngers a car can have is  "+maxPasenger); 
        System.out.println("The max speed of a car can have is  "+maxSpeed);         System.out.println("The max wheels a car have is  "+numWheels); 
    } 
    public void entersea() 
    { 
        System.out.println("The hovercraft has entered sea"); 
    } 
    public void enterland() 
    { 
        System.out.println("The hovercraft has entered land"); 
    } 
    public void launch() 
    { 
        System.out.println("The displacemnts of the hovercraft is "+displacement); 
    } 
} 
 
 
 
public class ExperimentNo_3 {   
  public static void main(String[] args) {   
            car c1=new car();      
               c1.drive(); 
        System.out.println(); 
        HoverCraft h1=new HoverCraft(); 
        h1.drive();     
            h1.launch();     
            h1.enterland();    
                 h1.entersea(); 
    } 
} 
