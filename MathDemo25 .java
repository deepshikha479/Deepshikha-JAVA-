import java.util.Scanner;

public class MathDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Convert to Integer wrapper object
        Integer integerObject = Integer.valueOf(num);

        // Get binary representation
        String binaryString = Integer.toBinaryString(integerObject);

        System.out.println("Binary representation: " + binaryString);
        sc.close();
    }
}

