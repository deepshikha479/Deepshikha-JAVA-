public class Greatest {
    public static void main(String[] args) {
        int a = 5, b = 12, c = 9;
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Greatest: " + max);
    }
}

