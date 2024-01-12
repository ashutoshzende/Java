
abstract class Shape {
    public double side, area, perimeter;

    public Shape(double side) {
        this.side = side;
        area = 0.0;
        perimeter = 0.0;
    }

    abstract public void calArea();

    abstract public void calPer();

    public void display() {
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}

class Rectangle extends Shape {
    Rectangle(double side) {
        super(side);
    }

    public void calArea() {
        area = side * side;

    }

    public void calPer() {
        perimeter = 2 * (side * side);

    }
}

class Circle extends Shape {
    Circle(double side) {
        super(side);
    }

    public void calArea() {
        area = 3.14 * side * side;

    }

    public void calPer() {
        perimeter = 2 * 3.14 * side;

    }
}

class Triangle extends Shape {
    Triangle(double side) {
        super(side);
    }

    public void calArea() {
        area = (side * side) / 2;

    }

    public void calPer() {
        perimeter = 2 * side * side;

    }
}

public class Abstract_class {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5);
        System.out.println("Rectangle");
        r1.calArea();
        r1.calPer();
        r1.display();
        System.out.println();
        Circle c1 = new Circle(10);
        System.out.println("Circle");
        c1.calArea();
        c1.calPer();
        c1.display();
        System.out.println();
        Triangle t1 = new Triangle(2.5);
        System.out.println("Traingle");
        t1.calArea();
        t1.calPer();
        t1.display();

    }

}
