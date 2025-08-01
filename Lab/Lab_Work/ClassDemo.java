package Basics.Lab.Lab_Work;
class Test 
{
    int a;
    int b;

    int sum(int a, int b) 
    {
        return a + b;
    }
}
public class ClassDemo 
{
    public static void main(String[] args) 
    {
        Test t = new Test();
        t.a = 9;
        t.b = 6;
        System.out.println(t.sum(t.a, t.b));
    }
}
