import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        int r;
        System.out.println("Enter Radius Of Your Circle:");
        r = sc.nextInt();
        double M = pi * r * r;

        System.out.println("Total Area of Circle" + M);

    }

}
