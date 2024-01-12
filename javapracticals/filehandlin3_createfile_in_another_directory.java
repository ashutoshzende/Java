import java.io.File;

public class filehandlin3_createfile_in_another_directory {
    public static void main(String[] args) {
        File f =new File("C:\Users\Ashutosh\OneDrive - D Y Patil Education Society\Documents\soft skill\javapracticals","MynewFile.txt");
        f.createNewFile();
        if (f.exists()) {
            System.out.println("File Directory is Created sucessfully");

        } else {
            System.out.println("File Directory does not Created");
        }
    }
    
}
