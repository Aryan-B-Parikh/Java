public class BasicClass
{
    // Fields
    private String name;
    private int age;
    private static String schoolName = "ABC School";
    
    // Constructor
    public BasicClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public String getName() {
        return name;
    }
}