package Basics.Lab.Lab_Work;
import java.util.Scanner;
class Add{
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        int x,y,sum;
        System.out.println("Enter first Number:");
        x=s.nextInt();
        System.out.println("Enter second Number:");
        y=s.nextInt();
        sum = x + y;
        System.out.println("Sum is :" + sum);
    }
}