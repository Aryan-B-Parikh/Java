public static int testMethod()
{
    try {
        return 1;
    } catch (Exception e) {
        return 2;
    }
    finally{
        return 3;
    }
}
public class ReturnDemo {
    public static void main(String args[])
    {
        System.out.println("Returned Value :" + testMethod());
    }
}
