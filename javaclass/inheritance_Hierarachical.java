import java.util.Scanner;
class Vehicle {
    int weight;
    int price;
    protected Scanner a=new Scanner(System.in);

    public Vehicle() {
        this.weight = 1000;
        this.price = 100000;
    }
    public Vehicle(int weight,int price)
    {

        this.weight=weight;
        this.price=price;

    }
    public void getvehicle(){
        System.out.println("Enter Weight of your vehicle:");
        weight=a.nextInt();
        System.out.println("Enter Price of your vehicle:");
        price=a.nextInt();
    }

    public void vehicleprint() {
        System.out.println("Weight of your vehicle:" + weight);
        System.out.println("Price of your vehicle:" + price);
    }
}

class Car extends Vehicle {
    String make;
    String model;

    public Car() {
        this.make = "Suzuki";
        this.model = "WagonR";
    }
    public Car( int weight,int price,String make,String model){
        super(weight,price);
        this.make=make;
        this.model=model;
       
    }
    public void getcar(){
        getvehicle();

        System.out.println("Enter Your Manufacturing Company Of your vehicle:");
        make=a.next();
        System.out.println("Enter Model name of Your vehicle:");
        model=a.next();
    }

    public void carprint() {
        vehicleprint();
        System.out.println("Manufacturing Company of your vehicle:" + make);
        System.out.println("Model name of your vehicle:" + model);
    }
}

class SportsCar extends Car {
    int ts;

    public SportsCar() {
        this.ts = 300;
    }
    public SportsCar(int weight,int price,String make,String model,int ts) {
        super( weight, price, make, model);
        this.ts = ts;
    }
    public void getsportscar(){
        getcar();
        System.out.println("Enter Top Speed Of Your Vehicle:");
        ts=a.nextInt();
    }
    public void sportscarprint() {
        carprint();
        System.out.println("Top Speed of your vehicle is:" + ts);
    }

}

class Bike extends Vehicle {
    String make;
    String model;
    int ep;

    public Bike() {
        this.make = "Honda";
        this.model = "CB";
        this.ep = 150;
    }
    public Bike( int weight,int price,String make,String model,int ep) {
        super( weight, price);
        this.make = make;
        this.model = model;
        this.ep = ep;
    }

    public void getbike(){
        System.out.println("Manufacturing company of your bike is:");
        make=a.next();
        System.out.println("Model name of your bike is:" );
        model=a.next();
        System.out.println("Engine Power  of your bike is:" );
        ep=a.nextInt();
    }

    public void bikeprint() {

        vehicleprint();
        System.out.println("Manufacturing company of your bike is:" + make);
        System.out.println("Model name of your bike is:" + model);
        System.out.println("Top speed  of your bike is:" + ep +"cc");

    }
}

public class inheritance_Hierarachical {

    public static void main(String[] args) {
        //  User input
       /* SportsCar c;
        c = new SportsCar();
        c.getsportscar();

        
        c.sportscarprint();
        Bike b;
        b = new Bike();
        b.getbike();
        b.bikeprint();
        */
        //parameterized constructor
        SportsCar c1;
        c1 = new SportsCar(12,12,"abc","mm",88);
        c1.sportscarprint();
          System.out.println("*********************************************************");
        Bike b1;
        b1=new Bike(1000,87000,"Honda","CB Shine",150);
        b1.bikeprint();
    
       
    }
}
