public class Student extends Person
{    
    int semister;
    public Student(String name, int age, int semister) 
    {
        super(name, age);
        this.semister = semister;
    }   
    @Override
    public void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Semister: "+semister);
    }
}