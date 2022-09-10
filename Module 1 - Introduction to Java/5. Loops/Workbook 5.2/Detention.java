import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        //Task 1 – Scan for the nextLine(), and print it 99 times. 
        
        String shouldWrite = scan.nextLine();

        for (int i = 0; i < 99; i++) {
            System.out.println(shouldWrite + " " + i);
        }
    }
}
