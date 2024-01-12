import java.io.*;
import java.util.*;
import java.lang.IllegalArgumentException;

class exp {
    String z = "x+y", a;
    boolean w;

    int x, y, c;
    Scanner s = new Scanner(System.in);

    exp(String st) {
        a = st;
        if (z.equals(a)) {
            w = true;
        } else {
            w = false;
        }
        try {
            if (w == true) {
                System.out.println("Expression is equal");
                System.out.println("Enter the value of x,y");
                x = s.nextInt();
                y = s.nextInt();
                c = x + y;
                System.out.println("Addition is=" + c);
            } else {

                // throw new IllegalArgumentException("Not equal");
            }
        }

        catch (IllegalArgumentException e) {
            System.out.println("wrong expression");
        }

        /*
         * finally { System.out.println("finally expression"); }
         */

    }
}

class expt6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String a1;
        System.out.println("Enter the expression:");
        a1 = s.next();
        exp e1 = new exp(a1);
    }
}
