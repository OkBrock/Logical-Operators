import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        
    // Logical operators are used to connect expressions

    // && = AND --> both conditions must be true
    // || = OR --> either condition must be true
    // ! = NOT --> reverses the boolean value of a condition

    // ------------------------------------------------------------------------

    int temp = 25;

    if(temp>30) {
        System.out.println("It is hot outside!");
    }

    else if(temp>=20 && temp<=30) {
        System.out.println("It is warm outside!");
    }

    else {
        System.out.println("It is cold outside!");
    }

    // ------------------------------------------------------------------------

    Scanner scanner = new Scanner(System.in);

    // ------------------------------------------------------------------------

    System.out.println("You are playing a game! Type q or Q to quit.");
    String response = scanner.next();

    if(response.equals("q") || response.equals("Q")) {
        System.out.println("You quit the game.");
    }

    // response.equalsIgnoreCase() is a lot easier

    else {
       System.out.println("You are still playing the game."); 
    }

    // ------------------------------------------------------------------------

    System.out.println("You are playing a game! Type q or Q to quit.");
    String response = scanner.next();

    if(!response.equals("q") && !response.equals("Q")) {
        System.out.println("You are still playing the game."); 
    }

    // response.equalsIgnoreCase() is a lot easier

    else {
        System.out.println("You quit the game.");
    }

    // ------------------------------------------------------------------------

    }
}
