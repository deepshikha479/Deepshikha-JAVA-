import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        // Square root
        System.out.println("The square root of " + num + " is: " + Math.sqrt(num));

        // Power of 2 raised to 3
        System.out.println("2 raised to the power 3 is: " + Math.pow(2, 3));

        // Absolute value of -15
        int neg = -15;
        System.out.println("Absolute value of " + neg + " is: " + Math.abs(neg));

        sc.close();
    }
}
