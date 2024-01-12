import java.io.*;

public class filehandling2_create_directory {

    public static void main(String[] args) {
        File f = new File("ashu");
        f.mkdir();

        if (f.exists()) {
            System.out.println("File Directory is Created sucessfully");

        } else {
            System.out.println("File Directory does not Created");
        }
    }
}
