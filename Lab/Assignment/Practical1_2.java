package Basics.Lab.Assignment;
import java.util.Objects;

class Student {
    private int studentID;
    private String studentName;
    private String studentDepartment;
    private Course course;

    class Course {
        private String course1;
        private String course2;
        private String course3;

        public Course() {
            this.course1 = "Unknown";
            this.course2 = "Unknown";
            this.course3 = "Unknown";
        }

        public Course(String c1, String c2, String c3) {
            this.course1 = c1;
            this.course2 = c2;
            this.course3 = c3;
        }

        public String toString() {
            return course1 + ", " + course2 + ", " + course3;
        }
    }

    public Student() {
        this.studentID = 0;
        this.studentName = "Unknown";
        this.studentDepartment = "Unknown";
        this.course = new Course();
    }

    public Student(int id, String name, String department, String c1, String c2, String c3) {
        this.studentID = id;
        this.studentName = name;
        this.studentDepartment = department;
        this.course = new Course(c1, c2, c3);
    }

    public void enrollInSemester(String semester, String[] courses) {
        class SemesterEnrollment {
            public void showEnrollment() {
                System.out.print("Semester " + semester + " courses for " + studentName + ": ");
                for (String c : courses)
                    System.out.print(c + " ");
                System.out.println();
            }
        }
        SemesterEnrollment se = new SemesterEnrollment();
        se.showEnrollment();
    }

    public void checkScholarshipEligibility(final int marks) {
        interface Scholarship {
            boolean isEligible(int marks);
        }
        Scholarship scholarship = new Scholarship() {
            public boolean isEligible(int marks) {
                return marks > 85;
            }
        };
        System.out.println(studentName + " scholarship eligibility (marks=" + marks + "): " + scholarship.isEligible(marks));
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Name: " + studentName +
                ", Department: " + studentDepartment +
                ", Courses: " + course;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return (studentID == student.studentID &&
                studentName.equals(student.studentName) &&
                studentDepartment.equals(student.studentDepartment));
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID, studentName, studentDepartment);
    }
}

public class Practical1_2 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Aryan", "Computer Science", "Maths", "Physics", "Chemistry");
        Student student2 = new Student(102, "Urval", "Information Technology", "Biology", "English", "Physics");
        Student student3 = new Student(101, "Aryan", "Computer Science", "Maths", "Physics", "Chemistry");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("Are student1 and student3 equal? " + student1.equals(student3));
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));

        System.out.println("Hash code of student1: " + student1.hashCode());
        System.out.println("Hash code of student2: " + student2.hashCode());
        System.out.println("Hash code of student3: " + student3.hashCode());

        student1.enrollInSemester("1", new String[]{"Data Structures", "OOP", "Discrete Math"});
        student2.enrollInSemester("2", new String[]{"Networking", "DSA", "Java"});

        student1.checkScholarshipEligibility(92);
        student2.checkScholarshipEligibility(76);
    }
}
