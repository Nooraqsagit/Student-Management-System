import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
public void saveToFile() {
    try {
        FileWriter writer = new FileWriter("students.txt");

        for (Student student : students) {
            writer.write(
                student.getId() + "," +
                student.getName() + "," +
                student.getEmail() + "," +
                student.getBranch() + "," +
                student.getCgpa() + "\n"
            );
        }

        writer.close();
        System.out.println("Data saved successfully!");

    } catch (IOException e) {
        System.out.println("Error saving file.");
    }
}
public void loadFromFile() {
    try {
        BufferedReader reader = new BufferedReader(new FileReader("students.txt"));

        String line;

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            int id = Integer.parseInt(data[0]);
            String name = data[1];
            String email = data[2];
            String branch = data[3];
            double cgpa = Double.parseDouble(data[4]);

            students.add(new Student(id, name, email, branch, cgpa));
        }

        reader.close();

    } catch (Exception e) {
        System.out.println("No previous data found.");
    }
}
}
