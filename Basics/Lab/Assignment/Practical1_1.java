package Basics.Lab.Assignment;

class employee{
    private int empId;
    private String empName;
    private String empDepartment;
    private int empSalary;
    private String empType;
    private static int empCount = 0;

    public employee()
    {
        empId = 0;
        empName = "Unknown";
        empDepartment = "Unknown";
        empSalary = 0;
        empCount++;
        empType = "Unknown";
    }

    public employee(int empId, String empName, String empDepartment, int empSalary, String empType) {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
        this.empType = empType;
        empCount++;
    }

    public void display() {
        System.out.println("Employee ID: " + empId + ", Name: " + empName + ", Department: " + empDepartment + ", Salary: " + empSalary + "Type: " + empType);
        System.out.println("Total Employees: " + empCount);
    }
}

public class Practical1_1{
    public static void main(String[] args) {
        employee emp1 = new employee(101, "Aryan", "HR", 50000, "Full-Time");
        emp1.display();
        employee emp2 = new employee(102, "Urval", "Finance", 60000, "Part-Time");
        emp2.display();
    }
}