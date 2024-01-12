import Package.Value.NumberCalculations;
import java.util.Scanner;
public class NumberCalculation {
    public static void main(String[] args) {
        NumberCalculations p=new NumberCalculations();
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter Number:");
        int n=sc.nextInt();

        p.factorial();
        // System.out.println("Enter Number:");
        // int a=sc.nextInt();
        // p.printTable();

    }
    
}
