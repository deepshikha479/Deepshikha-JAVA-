import java.util.Scanner;

public class MathDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        } else {
            System.out.println("Invalid input.");
        }

        sc.close();
    }
}
