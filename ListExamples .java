import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        // Create a list using ArrayList
        List<String> fruits = new ArrayList<>();

        // Add 3 elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Retrieve and print the second element (index 1)
        String secondFruit = fruits.get(1);
        System.out.println("The second fruit is: " + secondFruit);
    }
}
