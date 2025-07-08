package Basics.Lab;
class Student {
    int id;
    String name;
    Student() {
        id = 0;
        name = "Unknown";
    }
    Student(int i) {
        id = i;
        name = "Unknown";
    }
    Student(int i, String n) {
        id = i;
        name = n;
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Homework_2 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();

        
        Student s2 = new Student(101);
        s2.display();

        
        Student s3 = new Student(102, "Aryan");
        s3.display();
    }
}