import java.io.FileReader;
import java.io.IOException;

public class Unit8Qns2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
