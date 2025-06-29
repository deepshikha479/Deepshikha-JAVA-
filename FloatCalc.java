public class FloatCalc {
    public static void main(String[] args) {
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);

        System.out.println("Sum: " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Prod: " + (a * b));
        System.out.println("Div: " + (a / b));
        System.out.println("Mod: " + (a % b));
    }
}
