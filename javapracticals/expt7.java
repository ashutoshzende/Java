import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class expt7
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the File name");
        String fn =sc.next();
        File f=new File(fn);//it crete the referance of file

        if(f.createNewFile()) //it Crete the file if file is present then
         {
            System.out.println("File is created");
             System.out.println(" Select  Option  1.Append");
             int nu=sc.nextInt();
             if(nu==1)
             {
                 FileWriter fw =new FileWriter(fn,true); //To write into file
                 System.out.println("Enter the data");
                 String info =sc.next();
                 fw.write(info);
                 fw.close();
             }

         }
        else

        {
            System.out.println("File is already created");
            FileReader fr=new FileReader(f);
            int data;

            //this is use to display the content of file using the while loop
            while ((data=fr.read())!=-1)
            {
                System.out.print((char) data);
            }
            System.out.println("********************************************");


            System.out.println("Please select option");
            System.out.println("1.Append");
            System.out.println("2.Override");

            int op=sc.nextInt();
            if(op==1)
            {
                FileWriter fw =new FileWriter(fn,true);
                System.out.println("Enter the data");
                String info =sc.next();
                fw.write(info);
                fw.close();
            }
            if(op==2)
            {
                FileWriter fw =new FileWriter(fn);
                System.out.println("Enter the data");
                String info =sc.next();
                fw.write(info);
                fw.close();
            }
        }

    }
}

