import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void searchStudent(int id) {
    for (Student student : students) {
        if (student.getId() == id) {
            System.out.println(student);
            return;
        }
    }
    System.out.println("Student not found.");
}
public void deleteStudent(int id) {
    for (int i = 0; i < students.size(); i++) {
        if (students.get(i).getId() == id) {
            students.remove(i);
            System.out.println("Student deleted successfully!");
            return;
        }
    }
    System.out.println("Student not found.");
}
public void updateStudent(int id, String name, String email, String branch, double cgpa) {

    for (Student student : students) {

        if (student.getId() == id) {

            student.setName(name);
            student.setEmail(email);
            student.setBranch(branch);
            student.setCgpa(cgpa);

            System.out.println("Student updated successfully!");
            return;
        }
    }

    System.out.println("Student not found.");
}
}