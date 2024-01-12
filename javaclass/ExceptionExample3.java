// command line args
public class ExceptionExample3
{
    public static int divide(int x,int y) throws Exception {
      if(x<0 || y<0) {
        throw new Exception();
      }
      int z=x/y;
      return z;
    }

    public static void main(String args[]) throws Exception
    // args[0] - "12" "abcd"
    // args[1] - 22 
    {
        int x=Integer.parseInt(args[0]); // wrapper classes
        int y=Integer.parseInt(args[1]);
        int z=divide(x, y);
        System.out.println("Division :"+z);
    }
}