package Basics.Lab.Assignment;

import java.util.Objects;
class Student{
    private int studentID;
    private String studentName;
    private String studentDepartment;

    private class Course{
        private String cource1;
        private String cource2;
        private String cource3;
        public Course() {
            this.cource1 = "Unknown";
            this.cource2 = "Unknown";
            this.cource3 = "Unknown";
        }

        public Course(String c1, String c2, String c3) {
            this.cource1 = c1;
            this.cource2 = c2;
            this.cource3 = c3;
        }
    }

    public Student() {
        this.studentID = 0;
        this.studentName = "Unknown";
        this.studentDepartment = "Unknown";
    }

    public Student(int id, String name, String department, String c1, String c2, String c3) {
        this.studentID = id;
        this.studentName = name;
        this.studentDepartment = department;
        Course course = new Course(c1, c2, c3);
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + studentName + ", Department: " + studentDepartment;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentID == student.studentID &&
               studentName.equals(student.studentName) &&
               studentDepartment.equals(student.studentDepartment);
    }

    @Override
    public int hashCode(){ 
         return Objects.hash(studentID, studentName, studentDepartment);
    }
}

public class Practical1_2 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Aryan", "Computer Science", "Maths", "Physics", "Chemistry");
        System.out.println(student1);
        
        Student student2 = new Student(102, "Urval", "Information Technology", "Biology", "English", "Physics");
        System.out.println(student2);

        Student student3 = new Student(101, "Aryan", "Computer Science", "Maths", "Physics", "Chemistry");
        System.out.println(student3);

        System.out.println("Are student1 and student3 equal? " + student1.equals(student3));
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));
        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());
        System.out.println("Hash code of student3: " + student3.hashCode());
    }
}
