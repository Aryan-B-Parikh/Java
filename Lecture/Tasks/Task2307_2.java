package Basics.Lecture.Tasks;
interface  A
{
    int a=20;
    void display();
}
interface B extends  A
{
    float b=12.5f;
    void display();
}
interface C extends  A
{
    double c=12.5;
    void display();
}
interface D extends B,C
{
    double d=50L;
    void display();
}
class E implements D
{
    public void display()
    {
        System.out.println(D.d*C.c*B.b*A.a);
    }
}
public class Task2307_2 
{
    public static void main(String[] args) 
    {
        E e = new E();
        e.display();
    }
    
}
