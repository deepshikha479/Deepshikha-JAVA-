import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Unit8Qns1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to write to file: ");
        String input = sc.nextLine();

        FileWriter writer = new FileWriter("myfile.txt");
        writer.write(input);
        writer.close();

        System.out.println("Wrote to myfile.txt");

        sc.close();
    }
}

