package StudentManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\t\tStudent Management System");
            System.out.println("================================================");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid or unavailable input.. ");
                break;
            }
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Student Added Successfully");
                    break;
                case 2:
                    System.out.println("Student Updated Successfully");
                    break;
                case 3:
                    System.out.println("Student Deleted Successfully");
                    break;
                case 4:
                    System.out.println("Student View All Successfully");
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice Please Try Again");
            }
        }
    }
}
