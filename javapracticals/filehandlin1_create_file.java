import java.io.*;
public class filehandlin1_create_file {

    public static void main(String[] args) {
        File f=new File("Ashu.txt");
      
        try {
            f.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       if(f.exists())
       {
           System.out.println("File is Created sucessfully");

       }
       else{
           System.out.println("File does not Created");
       }
    }
}
