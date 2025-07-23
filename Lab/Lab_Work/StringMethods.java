package Basics.Lab.Lab_Work;

public class StringMethods 
{
    public  static void main(String[] args) 
    {
        StringBuilder str1 = new StringBuilder("Aryan ");
        StringBuilder str2 = new StringBuilder("Parikh");
        StringBuilder str3;
        
        str3 = str1.append(str2);
        System.out.println("String after appending: " + str3);
        str3.delete(6, 12);
        System.out.println("String after deleting: " + str3);
        str3.insert(6, "Parikh");
        System.out.println("String after inserting: " + str3);
        str3.indexOf("Pa");
        System.out.println("Index of 'Pa': " + str3.indexOf("Pa"));
        str3.reverse();
        System.out.println("String after reversing: " + str3);
        str3.reverse();
        str3.repeat("Ar", 4);
        System.out.println("String after repeating: " + str3);
        str3.delete(12,21);
        System.out.println("Code points of the string: " + str3.codePoints());
        System.out.println("Characters of the string: " + str3.chars());
        str3.insert(6,"B ");
        System.out.println("String after inserting 'B ': " + str3);
        System.out.println("Last index of 'a': " + str3.lastIndexOf("a"));
        System.out.println("String converted to String: " + str3.toString());
        System.out.println("Length of the string: " + str3.length());
        System.out.println("Capacity of the string: " + str3.capacity());
        str3.ensureCapacity(40);
        System.out.println("Capacity after ensuring: " + str3.capacity());
    }
}
