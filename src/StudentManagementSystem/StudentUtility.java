package StudentManagementSystem;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {
    static Scanner sc = new Scanner(System.in);

//    Add Student
    public static Student addStudent() {
        Student s =  new Student();
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Student Name: ");
        String name = sc.next();
        System.out.println("Enter Student Age: ");
        int age = sc.nextInt();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        return s;
    }

//    Display Student
    public static void getStudent(List<Student> student) {
        for (Student s : student){
            System.out.println("Student ID: " + s.getId());
            System.out.println("Student Name: " + s.getName());
            System.out.println("Student Age: " + s.getAge());
        }
    }
//    Update Student
    public static Student updateStudent(List<Student> student) {
        System.out.println("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

//        Done the changes in actual student List
        for (Student s : student){
            if (s.getId() == id){
                System.out.println("Enter New Name: ");
                s.setName(sc.nextLine());
                System.out.println("Enter New Age: ");
                s.setAge(sc.nextInt());
                return s;
            }
        }
        return null;
    }
//    Delete Student
    public static Student deleteStudent(List<Student> student) {
        System.out.println("Enter delete student Id: ");
        int id = sc.nextInt();
        Iterator<Student> iterator = student.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            if (s.getId() == id){
                iterator.remove();
                return s;
            }
        }
//        for(Student s : student){
//            if(s.getId() == id) {
//                student.remove(s);
//                return s;
//            }
//        }
        return null;
    }
}
