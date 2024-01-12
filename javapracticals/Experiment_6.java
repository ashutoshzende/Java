import java.util.*;
import java.io.*;
import java.lang.ArrayIndexOutOfBoundsException;

class Experiment_6 {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream f;
        try {
            f = new FileInputStream("Ashu.txt");
            do {
                i = f.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);

            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("showfile");
        }
    }
}
