public class Person
{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}