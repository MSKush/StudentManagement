package StudentManagementSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
//        Student student = new Student();
        int choice;
        while (true) {
            System.out.println("\t\tStudent Management System");
            System.out.println("================================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid or unavailable input.. ");
                break;
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Student student = StudentUtility.addStudent();
                    studentList.add(student);
                    System.out.println("Student Added Successfully");
                    break;
                case 2:
                    StudentUtility.getStudent(studentList);
                    System.out.println("Student View All Successfully");
                    break;
                case 3:
                    Student updatedStudent = StudentUtility.updateStudent(studentList);
                    if (updatedStudent != null) {
                        System.out.println("Student Updated Successfully");
                    }
                    else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 4:
                    Student dtStudent = StudentUtility.deleteStudent(studentList);
                    if (dtStudent != null) {
                        System.out.println(dtStudent.toString());
                        System.out.println("Student Deleted Successfully");
                    }
                    else {
                        System.out.println("Student Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice Please Try Again");
            }
        }
    }
}
