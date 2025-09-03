public class BasicTryCatch {
    public static void main(String[] args) {
        arithmeticOP();
    }
    public static void arithmeticOP()
    {
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        // catch (ArrayIndexOutOfBoundsException e1) {
        //     System.out.println(e1.getMessage());
        // }
        // catch (ArithmeticException e) {
        //     System.out.println(e.getMessage());
        // }
        finally{
            System.out.println("In Finally Block");
        }
    }
}
