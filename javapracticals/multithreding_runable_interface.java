import java.io.*;


class Mythread implements Runnable {
    public void run() {
        for(int i=0;i<10;i++)
        System.out.println("Child Class");
    }
}

public class multithreding_runable_interface {

    public static void main(String[] args)
     {
         Mythread r=new Mythread();
         Thread t=new Thread(r);
    
    
        t.start();
    }
}
