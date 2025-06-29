public class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    void compare(Student s) {
        if (this.id == s.id)
            System.out.println("IDs are equal");
        else
            System.out.println("IDs are different");
    }

    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102);
        s1.compare(s2);  // comparing s1 with s2
    }
}
