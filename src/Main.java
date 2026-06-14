import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    Student student = new Student(
                            id,
                            name,
                            email,
                            branch,
                            cgpa);

                    manager.addStudent(student);
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.println("Enter Student ID:");
                    int searchId = sc.nextInt();
                    manager.searchStudent(searchId);
                    break;
                    case 4:
                        System.out.println("4. Delete Student");
                        System.out.println("Enter Student ID:");
                        int deleteId = sc.nextInt();
                        manager.deleteStudent(deleteId);
                    break;
                    case 5:
                        System.out.println("Enter Student ID to Update:");
                        int updateId = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter New Name:");
                        String newName = sc.nextLine();
                        System.out.println("Enter New Email:");
                        String newEmail = sc.nextLine();
                        System.out.println("Enter New Branch:");
                        String newBranch = sc.nextLine();
                        System.out.println("Enter New CGPA:");
                        double newCgpa = sc.nextDouble();
                        manager.updateStudent(updateId, newName, newEmail, newBranch, newCgpa);
                    break;
                    case 6:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}