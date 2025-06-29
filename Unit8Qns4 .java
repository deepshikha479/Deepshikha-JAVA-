import java.io.*;

// Person class implementing Serializable
class Person implements Serializable {
    String name = "Deepshikha";
    int age = 29;
}

public class Unit8Qns4 {
    public static void main(String[] args) {
        try {
            // Serialize the object
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
            Person p = new Person();
            out.writeObject(p);
            out.close();

            // Deserialize the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
            Person p2 = (Person) in.readObject();
            in.close();

            // Display details
            System.out.println("Name: " + p2.name);
            System.out.println("Age: " + p2.age);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
