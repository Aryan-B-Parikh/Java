import package1.A;
import package1.C;
import package2.B;

public class PkgMain {
    public static void main(String[] args) {
        A objA = new A();
        objA.showVariables();

        System.out.println("\nAccess from Main (non-subclass, different package):");
        System.out.println("publicVar = " + objA.publicVar);  // allowed
        // System.out.println(objA.protectedVar); // Not allowed
        // System.out.println(objA.defaultVar);   // Not allowed
        // System.out.println(objA.privateVar);   // Not allowed

        C objC = new C();
        objC.accessFromSamePackage();

        B objB = new B();
        objB.accessFromSubclass();
    }
}
