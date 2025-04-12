package Bai4_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person);

        Student student = new Student("Alice", "456 Elm St", "Computer Science", 2024, 15000);
        System.out.println(student);

        Staff staff = new Staff("Bob", "789 Oak St", "ABC High School", 50000);
        System.out.println(staff);
    }
}

