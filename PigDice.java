import java.util.random;
import java.util.Scanner;

public class PigDice {

public static Scanner scan = new Scanner (in);

public static Random generator = new Random ();

public static int player1Score = 0;
public static int player2Score = 0;
// all players scores start at zero
//Look for a place to add some of this stuff to the player class.
//I need three classes to finish so I must addd something
public static int counter;

public static void main(String [] args){

    system.out.println("Welcome to the very fun game of Pig Dice that Mitchell has created!!!!!! ");
    system.out.println("Lucky player 1 gets to go first!! Please roll...");

    player1Attributes ();
}
//I could maybe add some of this to the player class (Anything about the player )
public static int Roll()
{
    int Low = 1;
    int High = 6;
    int Roll = generator.nextInt (High - Low) + Low;

    return Roll;
//I think I could add this to the dice class instead of having it in here
}
public static void p1Mechanics() {
    counter = 0;
    out.println("Would you like to play this turn...Yes!...No");
    String answer = scan.nextLine ();
    if (answer.equals("No")) {
        system.out.println ("Looks like player 1 has skipped their turn:(");
        system.out.println ("It is now player 2's turn to go");
        player2Mechanics ();
        //I think I need to keep this in here, cant move it to something else
    }
    //These are useing the roll mechanics so I need to keep it in here.
    int Roll = Roll();
    system.out.println ("Oh boy looks like you have rolled a" + Roll);
    while (player1Score + counter < 100) {

        while (Roll != 1) {
          //Work on the while statement
          //Run Code
          counter += Roll;
            out.println ("Do you want to roll again? Yes....or No?");
            answer = scan.nextLine ();
            while(!(answer.equals("Yes")) && !(answer.equals("No"))){
                out.println("Please enter: Yes or No");
                answer = scan.nextLine ();
              }
              if (answer.equals("No")) {
               p1Score += counter;
               system.out.println ("Oh well looks like player 1 has ended their turn...");
               system.out.println ("Player one vs player two " + p1Score + "-------" + p2Score);
               system.out.println ("oh boy its payers two turn to roll...");
               p2Mechanics ();
             }
             Roll = Roll ();
           system.out.println ("Will you look at that you rolled a" + Roll);

         }
         if (Roll == 1) {
            counter = 0;
            //if they role double ones their score goes back to zero
            //If they score a 1 they dont gain a score
          }
        }
        system.out.println ("Uh oh player 1 rolled a  '1'.");
       system.out.println ("Player one vs Player 2 " + p1Score + "-----" + p2Score);
       system.out.println ("It is now player 2's turn to roll");
       p2Mechanics ();
     }
   }
system.out.println("Player one has reached 100!!!");
system.out.println("Player 1 had won by  " + (p1Score - p2Score) + " points!");
exit (0);
}
