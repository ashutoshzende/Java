import java.util.*;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of the Array:");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the Elements:");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Even No Is:");
        for(int i=0;i<a;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
        
    }
    
}
