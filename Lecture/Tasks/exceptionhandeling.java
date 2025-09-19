import java.util.*;
class catchAgeException extends Exception{
    public catchAgeException(String str){
        super(str);
    }
}
public class exceptionhandeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        try {

            if(age<18){
                throw new catchAgeException("Age are not eligible for license");
            }
            else if(age>60){
                throw new catchAgeException("You don't need a license");
            }
            else
            {
                throw new catchAgeException("You are eligible for license");
            }
        } catch (catchAgeException e) {
            System.out.println(e);
        }
    }
}