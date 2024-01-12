
import java.io.*;
import java.util.*;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

class filehandling4_apend_and_overwrite_operation {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Console s=System.console();
        System.out.println("Enter file name");
        String fn = sc.next();

        File f = new File(fn);

        if (f.createNewFile()) {
            System.out.println("File created Successfully");

        }

        else {
            System.out.println("File already exists");
            FileReader fr = new FileReader(fn);
     
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

            System.out.println(" \n\n Select one option");
            System.out.println("1.Append\n2.Overwrite");
            int opt = sc.nextInt();

            if (opt == 1) {
                System.out.println("Please enter data to be appended");
                FileWriter fw = new FileWriter(fn, true);
        
                String inc =s.readLine();
                System.out.println("\n");
                fw.write(inc);
                System.out.println("\n");
                fw.close();

            }

            if (opt == 2) {
                System.out.println("Please enter data to be overwritten");
                FileWriter fw = new FileWriter(fn);
                String in = s.readLine();
                fw.write(in);
                fw.close();

            }

        }
    }
}