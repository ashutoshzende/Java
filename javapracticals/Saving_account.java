
import java.lang.Math;

class SavingsAccount {
    public static double AnnualInterestRate = 0.04;
    public double saving_Balance;

    public void set_curentBalnce(double b) {
        saving_Balance = b;
    }

    public double calculateMonthlyInterest() {
        saving_Balance = (saving_Balance * AnnualInterestRate) / 12 + saving_Balance;
        return saving_Balance;
    }

    public static void modifyInterestRate(double c) {
        AnnualInterestRate = c;
    }

}

public class Saving_account {
    public static void main(String[] args) { 
        SavingsAccount client1=new SavingsAccount();      
           SavingsAccount client2=new SavingsAccount();  
                  System.out.println("Month 1");         
                  client1.set_curentBalnce(2000); 
        System.out.println("The balance of client 1 with monthly interest rate of 4 % is "+Math.round(client1.calculateMonthlyInterest())+" Rs");         client2.set_curentBalnce(3000); 
        System.out.println("The balance of client 2 with monthly interest rate of 4 % is "+Math.round(client2.calculateMonthlyInterest())+" Rs"); 
        SavingsAccount.modifyInterestRate(0.05); 
        System.out.println("Month 2"); 
        System.out.println("The balance of client 1 with monthly interest rate of 5 % is "+Math.round(client1.calculateMonthlyInterest())+" Rs"); 
        System.out.println("The balance of client 2 with monthly interest rate of 5 % is "+Math.round(client2.calculateMonthlyInterest())+" Rs"); 
 
    }
}
