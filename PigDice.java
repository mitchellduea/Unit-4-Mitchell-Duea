
import java.util.random;
import java.util.Scanner;

public class PigDice {

public static Scanner scan = new Scanner (in);

public static Random generator = new Random ();

public static int player1Score = 0;
public static int player2Score = 0;

public static int counter;

public static void main(String [] args){

    system.out.println("Welcome to the very fun game of Pig Dice that Mitchell has created!!!!!! ");
    system.out.println("Lucky player 1 gets to go first!! Please roll...");

    player1Attributes ();
}

public static int Roll()
{
    int Low = 1;
    int High = 6;
    int Roll = generator.nextInt (High - Low) + Low;

    return Roll;

}
