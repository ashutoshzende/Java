
import java.io.*;
import java.util.*;
 class expt8
{
  public static void main(String args[])throws IOException
  {
   int age,weight,height;
   double phone;
   String city,name;
   FileOutputStream fos = new FileOutputStream("Sample.txt");
   DataOutputStream dos = new DataOutputStream(fos);
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your name : ");
   name = sc.next();
   dos.writeUTF(name);
   System.out.println("Enter your city name : ");
   city = sc.next();
   dos.writeUTF(city);
   System.out.println("Enter your age : ");
   age = sc.nextInt();
   dos.writeInt(age);
   System.out.println("Enter your weight : ");
   weight = sc.nextInt();
   dos.writeInt(weight);
   System.out.println("Enter your height : ");
   height = sc.nextInt();
   dos.writeInt(height);
   System.out.println(" Enter your phone : ");
   phone =sc.nextDouble();
   dos.writeDouble(phone);
   fos.close();
   dos.close();
  try 
  {
   FileInputStream fis = new FileInputStream("Sample.txt");
   DataInputStream dis = new DataInputStream(fis);
   name = dis.readUTF();
   city = dis.readUTF();
   age = dis.readInt();
   weight = dis.readInt();
   height = dis.readInt();
   phone = dis.readDouble();
   System.out.println("name = "+name);
   System.out.println("city name = "+city);
   System.out.println("age = "+age);
   System.out.println("weight = "+weight);
   System.out.println("height = "+height);
   System.out.println("phone = "+phone);   
   }
   catch(Exception e)
  {
   System.out.println(e);
   }
  }
}

