package Basics;
class Student
{
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
       
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
    }
}
class Exam extends Student
{
    int marks1;
    int marks2;
    int marks3;
    public Exam(String name, int rollno, int marks1, int marks2, int marks3) {
        super(name, rollno);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        System.out.println("Marks1: " + this.marks1);
        System.out.println("Marks2: " + this.marks2);
        System.out.println("Marks3: " + this.marks3);
        if (marks1 < 35 || marks2 < 35 || marks3 < 35) {
            System.out.println("Result: Fail");
        } else {
            System.out.println("Result: Pass");
        }
    }
}
class Task2 {
    public static void main(String[] args) {
        Exam exam = new Exam("Aryan", 101, 85, 90, 95);
        exam.displayInfo();
    }
}