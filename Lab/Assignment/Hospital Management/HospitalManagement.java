abstract class Staff {
    protected String name;
    protected int ID;
    protected String Department;
    public Staff(String name, int ID, String department) 
    {
        this.name = name;
        this.ID = ID;
        this.Department = department;
    }
    public abstract void performDuties();
}
abstract class MedicalStaff extends Staff
{
    String role;
    public MedicalStaff(String name, int ID, String department, String role) {
        super(name, ID, department);
        this.role = role;
    }
}
class Doctor extends MedicalStaff
{
    public Doctor(String name, int ID, String department)
    {
        super(name, ID, department,"Doctor");
    }
    @Override
    public void performDuties()
    {
        System.out.println("Operate Patient");
    }
}
class Nurse extends MedicalStaff
{
    public Nurse(String name, int ID, String department)
    {
        super(name, ID, department,"Nurse");
    }
    @Override
    public void performDuties()
    {
        System.out.println("Help Doctor");
    }
}
class AdministrativeStaff extends Staff
{
    public AdministrativeStaff(String name, int ID, String department)
    {
        super(name, ID, department);
    }
    @Override
    public void performDuties()
    {
        System.out.println("Does Administrative Tasks");
    }
}
final class FinanceDepartment extends AdministrativeStaff{
    public FinanceDepartment(String name, int ID, String department)
    {
        super(name, ID, department);
    }
    @Override
    public void performDuties()
    {
        System.out.println("Handels Financial Tasks for Adminstrative Department");
    }
}

public class HospitalManagement
{
    public static void main(int args[])
    {
        
    }
}
