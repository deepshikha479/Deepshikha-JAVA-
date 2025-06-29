import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Unit8Ans3 {
    public static void main(String[] args) {
        try (
            FileInputStream inp = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt")
        ) {
            int data;
            while ((data = inp.read()); = -1) {
                out.write(data);
            }

            System.out.println("File is copied.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
