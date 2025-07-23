
public class UniversityDemo{
    public static void main(String[] args) {
        Person p = new Person("Aryan",18);
        Student s = new Student("Aryan", 18, 3);
        Teacher t = new Teacher("Dr. OM", 38, "Mathematics");
        p.getDetails();
        s.getDetails();
        t.getDetails();
    }
}
