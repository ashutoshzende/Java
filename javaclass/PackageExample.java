import Package.addition;
import Package.division;
import Package.multiplication;
import Package.substraction;

import java.util.Scanner;

public class PackageExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice: ");
        System.out.println(" 1.Addition Of Two No.");
        System.out.println(" 2.Substraction Of Two No.");
        System.out.println(" 3.Multplication Of Two No.");
        System.out.println(" 4.Division Of Two No.");
        System.out.println(" 5.  None....");
        int op;
        op = sc.nextInt();

        if (op == 1) {
            addition m;
            m = new addition();
            m.add();
        } else if (op == 2) {
            substraction n;
            n = new substraction();
            n.sub();
        } else if (op == 2) {
            multiplication o;
            o = new multiplication();
            o.mul();
        } else if (op == 2) {
            division o;
            o = new division();
            o.div();
        } else {
            System.out.println("Stopped Program.........");
        }

    }
}
