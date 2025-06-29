public class OverloadExample {
    void display() {
        System.out.println("No parameters");
    }

    void display(String msg) {
        System.out.println("String: " + msg);
    }

    void display(int num) {
        System.out.println("Integer: " + num);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display();
        obj.display("Hello");
        obj.display(100);
    }
}


