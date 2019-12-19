import static java.lang.System.*;
import java.util.*;
//Importing the two main classes that i need

public class PigDie {

public static Scanner scan = new Scanner (in);
public static Random generator = new Random ();

public static int player1Score = 0;
public static int player2Score = 0;
public static int counter;

public static void main(String args[]){
    out.println("Welcome to the amazing game of Pig Dice that mitchell has created...");
    out.println("Lucky for player 1 becuase he gets to go first");
    player1Elements ();
}

public static int Roll() {
    int LowDie = 1;
    int HighDie = 7;
    int Roll = generator.nextInt (HighDie - LowDie) + LowDie;
    return Roll;
}

public static void player1Elements() {
    counter = 0;
    out.println("Would you like to play this turn...please say Yes...or No");
    String answer = scan.nextLine ();
    answer = answer.replaceAll (" ", "") ;
    answer = answer.toUpperCase ();
    if (answer.equals("NO")) {
        out.println ("Uh oh Player 1 has skipped their turn...");
        out.println ("Player 2's turn to roll");
        player2Elements ();
    }
    int Roll = Roll();
    out.println ("Oh Boy you rolled a" + Roll);
    while (player1Score + counter < 100) {
        while (Roll != 1) {
            counter += Roll;
            out.println ("You want to roll again Huh??? Yes...or No");
            answer = scan.nextLine ();
            answer = answer.replaceAll (" ", "") ;
            answer = answer.toUpperCase ();
            while(!(answer.equals("YES")) && !(answer.equals("NO"))){
                out.println("Oh my your being difficult please only enter Yes....or No");
                answer = scan.nextLine ();
                answer = answer.replaceAll (" ", "") ;
                answer = answer.toUpperCase ();
            }
            if (answer.equals("NO")) {
                player1Score += counter;
                out.println ("Scared are you...player 1 has ended their turn");
                out.println ("Player one vs player 2: " + player1Score + "-" + player2Score);
                out.println ("Lets see if you can do better...player two's turn to roll");
                player2Elements ();
            }
            Roll = Roll ();
            out.println ("Not bad you rolled a" + Roll);

        }
        if (Roll == 1) {
            counter = 0;
        }
        out.println ("How dissapointing player 1 has rolled a '1'.");
        out.println ("Player one vs player 2: " + player1Score + "-" + player2Score);
        out.println ("Lets see what you got player 2");
        player2Elements ();
    }
    out.println("Just like I thought player 1's score reached 100...");
    out.println("Player has won by " + (player1Score - player2Score) + " points...you should be ashamed player 2");
    exit (0);
}

public static void player2Elements() {
    counter = 0;
    out.println("Would you like to play? Yes...or...No...choose carefully");
    String answer = scan.nextLine ();
    answer = answer.replaceAll (" ", "") ;
    answer = answer.toUpperCase ();
    if (answer.equals("NO")) {
        out.println ("Scared player 2 is...skipped his turn he has");
        out.println ("It is now player ones's turn to roll...");
        player1Elements ();
    }
    int Roll = Roll();
    out.println ("oooo you have rolled a " + Roll);
    maxScore: while (player2Score < 100) {
        while (Roll != 1) {
            counter += Roll;
            out.println ("Do you want to roll again...do you...do you...Yes or No");
            answer = scan.nextLine ();
            answer = answer.replaceAll (" ", "") ;
            answer = answer.toUpperCase ();
            while(!(answer.equals("YES")) && !(answer.equals("NO"))){
                out.println("Not very smart you are.... please answer yes...or...No");
                answer = scan.nextLine ();
                answer = answer.replaceAll (" ", "") ;
                answer = answer.toUpperCase ();
            }
            if (answer.equals("NO")) {
                player2Score += counter;
                out.println ("Player 2 scared has ended turn");
                out.println ("Player one vs player 2 " + player1Score + "-" + player2Score);
                out.println ("Take it home player 1...it is now your turn");
                player1Elements ();
            }
            Roll = Roll ();
            out.println ("You rolled a " + Roll);

        }
        if (Roll == 1) {
            counter = 0;
        }
        out.println ("Big suprise player one has rolled a '1'.");
        out.println ("Player one vs player 2: " + player1Score + "-" + player2Score);
        out.println ("Again it is player ones turn to roll");
        player1Elements ();
    }
    out.println("Oh wow player 2 has won!");
    out.println("Player 2 wins by" + (player2Score - player1Score) + " points. Straight impressive!");

    //dont think i need exit but i can still use it 
    exit (0);
}

}
