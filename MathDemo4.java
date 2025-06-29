import java.util.Scanner;

public class MathDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value (e.g., 12.34): ");
        String input = sc.nextLine();

        // Optional: Clean the string if it contains commas
        input = input.replace(",", "");

        // Convert string to Double wrapper object
        Double doubleValue = Double.valueOf(input);

        System.out.println("Double value: " + doubleValue);

        sc.close();
    }
}

