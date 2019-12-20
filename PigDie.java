import static java.lang.System.*;
import java.util.*;
//Importing the two main classes that i need

public class PigDie {

public static Scanner scan = new Scanner (in);
public static Random generator = new Random ();

//initialte the scanners and random generator for the dice


public static int player1Score = 0;
public static int player2Score = 0;
//Both players will start at 0 score this is what these ints are

public static int counter;


public static void main(String args[]){


    out.println("Welcome to the amazing game of Pig Dice that mitchell has created...");
    out.println("Lucky for player 1 becuase he gets to go first");
//im starting to write prinln statemnets like this its quicker and easier


    player1Elements ();



}

public static int Roll() {
    int LowDie = 1;

    int HighDie = 7;

    int Roll = generator.nextInt (HighDie - LowDie) + LowDie;
//these are the conditions for the dice. This is also in the dice class i added it in here to though

    return Roll;
}

public static void player1Elements() {
    counter = 0;
//Giving the player elements and stating them


    out.println("Would you like to play this turn...please say Yes...or No");

    String answer = scan.nextLine ();

    answer = answer.replaceAll (" ", "") ;
    answer = answer.toUpperCase ();
    if (answer.equals("NO")) {
        out.println ("Uh oh Player 1 has skipped their turn...");
//Ive tried to make the println statemtns as fun as possible

        out.println ("Player 2's turn to roll");


        player2Elements ();
    }
    int Roll = Roll();
    out.println ("Oh Boy you rolled a" + Roll);



    while (player1Score + counter < 100) {
        while (Roll != 1) {
            counter += Roll;

//here is my counting system. all this gets addec toeach players counter
            out.println ("You want to roll again Huh??? Yes...or No");
            answer = scan.nextLine ();


            answer = answer.replaceAll (" ", "") ;
//This is what hapepens they say yes or no and it gets converted to all uppercase to mkae it easier on the inputer
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
//Here is a look at what happens when you roll a 1 you go back to zero

        }
        out.println ("How dissapointing player 1 has rolled a '1'.");

//more fun prinln statemnts for the player
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
//here is defintions of player 2

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
//very repetive all this was i feel like i couldve simplified it and done it easier

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
//here is the zero role for player 1

        out.println ("Player one vs player 2: " + player1Score + "-" + player2Score);
        out.println ("Again it is player ones turn to roll");


        player1Elements ();
    }
    out.println("Oh wow player 2 has won!");
    out.println("Player 2 wins by" + (player2Score - player1Score) + " points. Straight impressive!");
//the final ending whihc just subtracts scores and shows it
    //dont think i need exit but i can still use it
    exit (0);
}

}
