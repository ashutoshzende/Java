import java.io.*;
import java.util.*;

class expt10 {
    public static void main(String args[]) {
                    try
                    {
                      FileReader fr= new FileReader("Ashu.txt");
                      BufferedReader br= new BufferedReader(fr);
                      LinkedList<String> ll=new LinkedList<String>();
                     String str;
                       while((str=br.readLine())!=null)
                         {
                         ll.add(str);
                         System.out.println(str);
                        }
                     System.out.println("Linked List"+1);
                     LinkedList<String> llr= new LinkedList<String>();
                     for (int i=ll.size()-1;i>=0;i--) 
                     System.out.println("After Reversing");
                        for(String str1:llr)
                        {
                            System.out.println(str1);
                        }}catch(

    Exception e)
    {
    }
}

}
