// 1.constructor overloading ,static variabes 2. overriding 2 strings (System.out.println(sobj); should print object information)
package Basics.Lab;

class Student{
    private int stdId;
    private String stdName;

    public void setStdId(int id) {
        this.stdId = id;
    }

    public void setStdName(String name) {
        this.stdName = name;
    }

    public int getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }

    @Override
    public String toString() {
        return "Student ID: " + stdId + ", Name: " + stdName;
    }
}
public class Homework_1{
    public static void main(String[] args) {
        Student sobj = new Student();
        sobj.setStdId(101);
        sobj.setStdName("Aryan");
        System.out.println(sobj);
    }
}
