package Basics.Lab.Lab_Work;
class CommandLineDemo
{
    public static void main(String[] args)
    {
       if(args.length>0)
       {
            System.out.println("Hello " + args[0] + "!");
        } 
        else 
        {
            System.out.println("Hello, World!");
        }
    }
}