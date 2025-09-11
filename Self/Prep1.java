import java.util.Scanner;
class Rectangle{
    float length;
    float height;
    public float calcArea()
    {
        return length*height ;
    }
}
public class Prep1 {
    public static void main(String args[])
    {
        Rectangle r1 =new Rectangle();
        Scanner sc = new Scanner(System.in);
        r1.length=sc.nextFloat();
        r1.height=sc.nextFloat();
        r1.calcArea();
    }
    
}