package Basics.Lecture;
interface Add
{
    int add(int a,int b);
}
interface Multi
{
    int Mul(int a,int b);
}
interface Sub
{
    int sub(int a,int b);
}
interface Div
{
    int div(int a,int b);
}
class Calculator implements Add, Multi,Sub,Div
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int Mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
class Task160725
{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition:"+c.add(2, 3));
        System.out.println("Substraction:"+c.sub(8, 3));
        System.out.println("Multiplication::"+c.Mul(2, 3));
        System.out.println("Division:"+c.div(2, 3));
    }
}