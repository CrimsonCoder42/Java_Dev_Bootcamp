import java.util.Scanner;

public class DiceJack{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than 1. Shutting game down.");
            System.exit(0); 
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be higher than 6. Shutting game down.");
            System.exit(0); 
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". Number sum = " + sumOfNumbers );

        if (checkWin(sumDiceRolls,sumOfNumbers)) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }

        scan.close();

       
    }

    public static int rollDice() {
        double random = Math.random() * 6;
        random += 1;
        return (int)random;
    }

    public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {

        return ((sumOfNumbers > sumDiceRolls) && (sumDiceRolls - sumDiceRolls) < 3);
    }

}