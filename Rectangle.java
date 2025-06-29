class Rectangle {
    int length, width;

    // Default constructor
    Rectangle() {
        length = 5;
        width = 3;
    }

    // Parameterized constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

    int perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();          // using default constructor
        Rectangle r2 = new Rectangle(10, 4);     // using parameterized constructor

        System.out.println("Default - Area: " + r1.area() + ", Perimeter: " + r1.perimeter());
        System.out.println("Custom  - Area: " + r2.area() + ", Perimeter: " + r2.perimeter());
    }
}

