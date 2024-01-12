
import java.io.*;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Class");
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("Parent Class");
        }

    }

}
