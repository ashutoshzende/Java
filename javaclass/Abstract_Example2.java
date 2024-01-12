import java.util.Scanner;

abstract class Sports {
    abstract void sportsType();

    abstract void sportTime();

    abstract void sportPlayer();

    abstract void sportRules();
}

class Football extends Sports {
    public void sportsType() {
        System.out.println("It is a Team sports");
    }

    public void sportTime() {
        System.out.println("Their are two halfes  ,Total 90 Min");
    }

    public void sportPlayer() {
        System.out.println("Their are Total 11 players");

    }

    public void sportRules() {
        System.out.println(
                "A yellow card shown by the referee cautions the player for the offence committed. Serious offences (or two yellows during the match) receive a red card. This results in a sending off. The player discontinues further involvement in the game.");
    }

}

class Cricket extends Sports {

    public void sportsType() {
        System.out.println("It is a Team sports");
    }

    public void sportTime() {
        System.out.println("Two Inings of 90 minutes");
    }

    public void sportPlayer() {
        System.out.println("Their are Total 11 players");

    }

    public void sportRules() {
        System.out.println("Each team is made up of 11 players.");
        System.out.println("The bowler must bowl 6 legal deliveries to constitute an over.");
    }
}

class Tennis extends Sports {
    public void sportsType() {
        System.out.println("It is not Team  sports");
    }

    public void sportTime() {
        System.out.println("Their are two halfes  ,Total 60 Min");
    }

    public void sportPlayer() {
        System.out.println("Their are Total 2 players");

    }

    public void sportRules() {
        System.out.println(
                "The game starts with a coin toss to determine which player must serve first and which side they want to serve from..");
    }

}

public class Abstract_Example2 {

    public static void main(String[] args) {
        int op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Choice:");
        System.out.println("1. Football  2. Cricket  3. Tennis " );
        
        op=sc.nextInt();
        Sports s;

        
        if(op==1)
        {
            s=new Football();
            s.sportsType();
            s.sportPlayer();
            s.sportTime(); 
            s.sportRules();
        }
        else if(op==2)
        {
            s=new Cricket();
            s.sportsType();
            s.sportPlayer();
            s.sportTime(); 
            s.sportRules();
        }
        else if(op==3)
        {
            s=new Tennis();
            s.sportsType();
            s.sportPlayer();
            s.sportTime(); 
            s.sportRules();
        }
        else
        {
        System.out.println("Invalid Input......");
        }
        

    }

}
