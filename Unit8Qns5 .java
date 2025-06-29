import java.io.*;

public class Unit8Qns5 {
    public static void main(String[] args) {
        try {
            // Create directory
            File dir = new File("testDir");
            dir.mkdir();  // Make directory

            // Create file inside the directory
            File f = new File(dir, "note.txt");
            f.createNewFile();  // Create file

            // Write to the file
            FileWriter wri = new FileWriter(f);
            wri.write("BCA Motos");
            wri.close();

            System.out.println("Content written to note.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
