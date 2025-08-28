public class BasicConcepts {
    public static void main(String[] args) {
        System.out.println("=== Basic Java Concepts ===\n");
        
        // Variables
        int age = 25;
        String name = "John";
        boolean isStudent = true;
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
        
        // Simple if-else
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        
        // Simple loop
        System.out.print("Numbers: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Array
        int[] numbers = {10, 20, 30};
        System.out.println("First number: " + numbers[0]);
        
        // Method call
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
    }
    
    // Simple method
    public static int add(int a, int b) {
        return a + b;
    }
}