import java.util.Scanner;
import java.util.concurrent.ExecutionException;

class PinNotFound extends Exception {
    public String getMessage() {
        return "Please Enter Valid PIN..";
    }
}

class InsufficientAmmount extends Exception {
    public String getMessage() {
        return "Insufficient Ammount in your account.";
    }
}

class Account {
    int acc_no;
    int pin;
    double current_bal;

    public Account(int acc_no, int pin, int current_bal) {
        this.pin = pin;
        this.current_bal = current_bal;
        this.acc_no = acc_no;
    }

    public void atm_withdraw(int pin, int Ammount) throws PinNotFound, InsufficientAmmount 
    {
        if (this.pin != pin) {
            throw new PinNotFound();
        } else 
        if (Ammount > current_bal) 
        
        {
            throw new InsufficientAmmount();
        } 
        else
         {
            System.out.println("Transaction Succesful...");
            current_bal =   current_bal-Ammount;
            System.out.println(current_bal);
          }

    }

}

public class Exception_Example {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.println("Enter your Account No:");
            int acc_no = sc.nextInt();
            System.out.println("Enter Your pin:");
            int pin = sc.nextInt();
            System.out.println("Enter Your Balance:");
            int current_bal = sc.nextInt();
            Account a = new Account(acc_no, pin, current_bal);

            System.out.println("Enter Ammount to withdraw:");
            int w = sc.nextInt();
            System.out.println("Enter pin for confirmation:");
            int con_pin = sc.nextInt();

            a.atm_withdraw(con_pin,w);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
