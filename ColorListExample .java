import java.util.ArrayList;

public class ColorListExample {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> colors = new ArrayList<>();

        // Add 3 elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Remove one element (e.g., "Green")
        colors.remove("Green");

        // Display the final list
        System.out.println("ArrayList after removing an element: " + colors);
    }
}
