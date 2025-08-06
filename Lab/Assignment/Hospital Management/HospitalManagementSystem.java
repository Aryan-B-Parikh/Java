// Abstract base class for all staff members
abstract class Staff {
    protected String name;
    protected int ID;
    protected String department;
    
    // Constructor using super keyword concept
    public Staff(String name, int ID, String department) {
        this.name = name;
        this.ID = ID;
        this.department = department;
    }
    
    // Abstract method to be implemented by subclasses
    public abstract void performDuties();
    
    // Common method for all staff
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + ID + ", Department: " + department);
    }
    
    // Getters
    public String getName() { return name; }
    public int getID() { return ID; }
    public String getDepartment() { return department; }
}

// Abstract subclass for medical personnel - cannot be instantiated
abstract class MedicalStaff extends Staff {
    protected String medicalRole;
    protected int yearsOfExperience;
    
    public MedicalStaff(String name, int ID, String department, String medicalRole, int yearsOfExperience) {
        super(name, ID, department); // Using super keyword
        this.medicalRole = medicalRole;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    // Medical staff specific method
    public void provideMedicalCare() {
        System.out.println(name + " is providing medical care as a " + medicalRole);
    }
    
    public String getMedicalRole() { return medicalRole; }
    public int getYearsOfExperience() { return yearsOfExperience; }
}

// Concrete subclass - Doctor
class Doctor extends MedicalStaff {
    private String specialization;
    
    public Doctor(String name, int ID, String department, int yearsOfExperience, String specialization) {
        super(name, ID, department, "Doctor", yearsOfExperience);
        this.specialization = specialization;
    }
    
    @Override
    public void performDuties() {
        System.out.println("Dr. " + name + " is diagnosing patients, prescribing treatments, and performing surgeries in " + specialization);
    }
    
    // Doctor-specific method
    public void performSurgery() {
        System.out.println("Dr. " + name + " is performing surgery in " + specialization);
    }
    
    public String getSpecialization() { return specialization; }
}

// Concrete subclass - Nurse (fixed typo from "Nures")
class Nurse extends MedicalStaff {
    private String nursingType;
    
    public Nurse(String name, int ID, String department, int yearsOfExperience, String nursingType) {
        super(name, ID, department, "Nurse", yearsOfExperience);
        this.nursingType = nursingType;
    }
    
    @Override
    public void performDuties() {
        System.out.println("Nurse " + name + " is monitoring patients, administering medications, and assisting doctors as a " + nursingType + " nurse");
    }
    
    // Nurse-specific method
    public void administerMedication() {
        System.out.println("Nurse " + name + " is administering medication to patients");
    }
    
    public String getNursingType() { return nursingType; }
}

// Concrete subclass - Administrative Staff
class AdministrativeStaff extends Staff {
    private String administrativeRole;
    
    public AdministrativeStaff(String name, int ID, String department, String administrativeRole) {
        super(name, ID, department);
        this.administrativeRole = administrativeRole;
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is handling administrative tasks: managing records, scheduling appointments, and coordinating departments as " + administrativeRole);
    }
    
    // Administrative staff specific method
    public void manageRecords() {
        System.out.println(name + " is managing hospital records and documentation");
    }
    
    public String getAdministrativeRole() { return administrativeRole; }
}

// Final class - cannot be extended further
final class FinanceDepartment extends AdministrativeStaff {
    private double budgetLimit;
    
    public FinanceDepartment(String name, int ID, String department, double budgetLimit) {
        super(name, ID, department, "Financial Manager");
        this.budgetLimit = budgetLimit;
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is managing hospital finances: budgeting, billing, payroll, and financial reporting with budget limit of $" + budgetLimit);
    }
    
    // Finance-specific method
    public void generateFinancialReport() {
        System.out.println(name + " is generating financial reports and managing budget of $" + budgetLimit);
    }
    
    public double getBudgetLimit() { return budgetLimit; }
}

// Main class to demonstrate the Hospital Management System
public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===\n");
        
        // Creating objects of different staff types
        Staff[] hospitalStaff = {
            new Doctor("John Smith", 101, "Cardiology", 15, "Heart Surgery"),
            new Doctor("Emily Johnson", 102, "Pediatrics", 8, "Child Care"),
            new Nurse("Sarah Wilson", 201, "ICU", 5, "Critical Care"),
            new Nurse("Mike Brown", 202, "Emergency", 3, "Emergency"),
            new AdministrativeStaff("Lisa Davis", 301, "Administration", "Records Manager"),
            new FinanceDepartment("Robert Taylor", 401, "Finance", 5000000.0)
        };
        
        System.out.println("1. DEMONSTRATING POLYMORPHISM:");
        System.out.println("Calling performDuties() on all staff members:\n");
        
        // Runtime polymorphism - same method call, different implementations
        for (Staff staff : hospitalStaff) {
            staff.displayInfo();
            staff.performDuties();
            System.out.println();
        }
        
        System.out.println("\n2. DEMONSTRATING UPCASTING:");
        System.out.println("Treating specific staff as generic Staff references:\n");
        
        // Upcasting examples
        Staff doctorAsStaff = new Doctor("Dr. Anna White", 103, "Neurology", 12, "Brain Surgery");
        Staff nurseAsStaff = new Nurse("Tom Green", 203, "Surgery", 7, "Surgical");
        
        System.out.println("Doctor upcast to Staff:");
        doctorAsStaff.performDuties();
        
        System.out.println("\nNurse upcast to Staff:");
        nurseAsStaff.performDuties();
        
        System.out.println("\n3. DEMONSTRATING DOWNCASTING:");
        System.out.println("Safely casting Staff references back to specific types:\n");
        
        // Downcasting with type checking
        for (Staff staff : hospitalStaff) {
            System.out.println("Processing: " + staff.getName());
            
            // Safe downcasting with instanceof check
            if (staff instanceof Doctor) {
                Doctor doctor = (Doctor) staff;
                doctor.performSurgery();
                System.out.println("Specialization: " + doctor.getSpecialization());
            }
            else if (staff instanceof Nurse) {
                Nurse nurse = (Nurse) staff;
                nurse.administerMedication();
                System.out.println("Nursing Type: " + nurse.getNursingType());
            }
            else if (staff instanceof FinanceDepartment) {
                FinanceDepartment finance = (FinanceDepartment) staff;
                finance.generateFinancialReport();
                System.out.println("Budget Limit: $" + finance.getBudgetLimit());
            }
            else if (staff instanceof AdministrativeStaff) {
                AdministrativeStaff admin = (AdministrativeStaff) staff;
                admin.manageRecords();
                System.out.println("Role: " + admin.getAdministrativeRole());
            }
            System.out.println();
        }
        
        System.out.println("4. DEMONSTRATING INHERITANCE HIERARCHY:");
        System.out.println("Medical staff common behavior:\n");
        
        // Demonstrating MedicalStaff common methods
        for (Staff staff : hospitalStaff) {
            if (staff instanceof MedicalStaff) {
                MedicalStaff medStaff = (MedicalStaff) staff;
                medStaff.provideMedicalCare();
                System.out.println("Experience: " + medStaff.getYearsOfExperience() + " years\n");
            }
        }
        
        System.out.println("5. DEMONSTRATING ABSTRACT CLASSES:");
        // The following would cause compilation errors:
        // Staff staff = new Staff(); // Cannot instantiate abstract class
        // MedicalStaff medStaff = new MedicalStaff(); // Cannot instantiate abstract class
        
        System.out.println("Abstract classes Staff and MedicalStaff cannot be instantiated directly.");
        System.out.println("They provide common structure and enforce implementation of abstract methods.\n");
        
        System.out.println("6. DEMONSTRATING FINAL CLASS:");
        System.out.println("FinanceDepartment is a final class and cannot be extended further.");
        // The following would cause compilation error:
        // class ExtendedFinance extends FinanceDepartment {} // Cannot extend final class
        
        System.out.println("\n=== HOSPITAL MANAGEMENT SYSTEM DEMONSTRATION COMPLETE ===");
    }
}