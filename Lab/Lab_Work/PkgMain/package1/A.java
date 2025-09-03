package package1;

public class A {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;   // default (package-private)
    private int privateVar = 40;

    public void showVariables() {
        System.out.println("Inside class A (same class):");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("privateVar = " + privateVar);
    }
}
