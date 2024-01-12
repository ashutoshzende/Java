
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Film {
    protected String fn;
    int rating;
    final static String pcn="Infosys";

    public Film(String fn, int rating) {
        this.fn = fn;
        this.rating = rating;

    }

    public void setdata() throws Exception {
        if (rating == 5) {
            System.out.println("Very Good");
        } else if (rating == 4) {
            System.out.println("Good");
        } else if (rating == 3) {
            System.out.println("Okay..");

        } else if (rating == 2) {
            System.out.println("Bad......");

        } else if (rating == 1) {
            System.out.println("Very Bad...");
        } else {
            
            throw new Exception("Please Enter 1--5,,");

        }
    }
    public void  printData()
    {
        System.out.println("Film name"+ fn);
        System.out.println("Rating:"+rating);
        System.out.println("Company Name is:"+pcn);
    }

}

public class Exception_Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter Film Name:");
        String fn=sc.nextLine();
        System.out.println("Enter Your Rating:");
        int rating=sc.nextInt();
        
        Film f=new Film(fn, rating);
        f.printData();
       f.setdata();
         
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
