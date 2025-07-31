//find a way to communicate student and teacher
class Task2307{
    public static void main(String[] args) {
        Person p=new Student("Aryan", 18, 3);
        Person t=new Teacher("Dr. OM", 38, "Mathematics");
        t.age = p.age;
        t.name = p.name;
        System.out.println("Teacher Details:");
        t.getDetails();
    }
}