@FunctionalInterface
interface Calculator
{
    int operate(int a, int b);
}
class Addition implements Calculator
{
    @Override
    public int operate(int a,int b)
    {
        return a+b;
    }
}
class Multiplication implements Calculator
{
    @Override
    public int operate(int a,int b)
    {
        return a*b;
    }
}
public class FunctionalDemo {
    public static void main(String[] args) {
        Calculator add = new Addition();
        Calculator mult = new Multiplication();
        add.operate(10, 20);
        mult.operate(10, 20);

        //annonimas class implementation
        Calculator addition=new Calculator(){
            @Override
            public int operate(int x, int y)
            {
                return x+y;
            }
        };

         Calculator multiplication =new Calculator(){
            @Override
            public int operate(int x, int y)
            {
                return x*y;
            }
        };

        //using lemda expressions
        Calculator addition1=(a,b)->a+b;
        System.out.println("Addition:"+addition1.operate(5,5));

        Calculator multiplication1=(a,b)->a*b;
        System.out.println("Multiplication:"+multiplication1.operate(5,5));

        Calculator division=(a,b)->a/b;
        System.out.println("Division:"+division.operate(5,5));

        Calculator substraction=(a,b)->a-b;
        System.out.println("Substraction:"+substraction.operate(10, 3));
    }
}
