package Basics.Lab.Lab_Work;
import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        if (s instanceof Student) {
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            s.setStdId(id);
            s.setStdName(name);
            System.out.println("Student ID: " + s.getStdId());
            System.out.println("Student Name: " + s.getStdName());
        } 
        else 
        {
            System.out.println("Object is not an instance of Student class.");
        }
    }
}
