package Basics.Lab.Lab_Work;
import java.util.Scanner;
class Main
{
    public static void main(String[] a)
    {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");
        name=s.nextLine();
        System.out.println("Your Name is " + name);
    }
}