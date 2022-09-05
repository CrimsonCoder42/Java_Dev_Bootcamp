public class IfElse {
    public static void main(String[] args) {
        int grade = 65;

        if (grade >= 80) {
            System.out.println("YOU GOT AN A!");
        } else if (grade >= 70) {
            System.out.println("YOU GOT AN B!");
        }else if (grade >= 60) {
            System.out.println("YOU GOT AN C!");
        }else {
            System.out.println("YOU GOT AN D!");
        }
    }
}