import java.util.Scanner;

public class BoolDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st boolean value (true/false): ");
        String input1 = sc.nextLine();

        System.out.print("Enter 2nd boolean value (true/false): ");
        String input2 = sc.nextLine();

        // Convert string inputs to Boolean wrapper objects
        Boolean bool1 = Boolean.valueOf(input1);
        Boolean bool2 = Boolean.valueOf(input2);

        // Logical AND operation
        Boolean result = bool1 && bool2;

        System.out.println("Logical AND result: " + result);

        sc.close();
    }
}
