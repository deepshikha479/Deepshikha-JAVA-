import java.util.Scanner;

class Factorial {
    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to read input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = fact(num);
            System.out.println("Factorial: " + result);
        }

        sc.close(); 
    }
}
