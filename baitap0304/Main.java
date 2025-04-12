package baitap0304;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        AuthService authService = new AuthService();

        try {
            // Add a new student
            Student student = new Student();
            studentDAO.addStudent(student);

            // Login
            boolean loggedIn = authService.login("annv@vku.udn.vn");
            System.out.println("Login success: " + loggedIn);

            // Get all students
            List<Student> students = studentDAO.getAllStudents();
            for (Student s : students) {
                System.out.println(s);
            }

            // Update a student
            student.setName("Nguyen Van B");
            studentDAO.updateStudent(student);

            // Delete a student
            studentDAO.deleteStudent(student.getStudentID());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
