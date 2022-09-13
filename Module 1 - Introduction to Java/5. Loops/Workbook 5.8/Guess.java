import java.util.Scanner;
import java.util.Random;

public class Guess  {
    public static void main(String[] args) {

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */

        Random randInt = new Random(); 
        int randNum = randInt.nextInt((10 - 1) + 1) + 1;
        System.out.println(randNum);
        System.out.println("Hello World!");

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);

       int guessedNum = scan.nextInt();

        while (randNum != guessedNum) {
            System.out.println("Guess Again!");
            guessedNum = scan.nextInt();
        }
        System.out.println("You got it!");

        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */        
        scan.close();
    }

}
