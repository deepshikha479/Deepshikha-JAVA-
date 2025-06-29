import java.util.ArrayList;

public class IntegerListExamples {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 3 numbers to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Display the list
        System.out.println("The numbers in the ArrayList are:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
