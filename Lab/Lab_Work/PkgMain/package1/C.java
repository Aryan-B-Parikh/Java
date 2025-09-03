package package1;

public class C {
    public void accessFromSamePackage() {
        A obj = new A();
        System.out.println("Inside class C (same package, non-subclass):");

        System.out.println("publicVar = " + obj.publicVar);     // ✅ allowed
        System.out.println("protectedVar = " + obj.protectedVar); // ✅ allowed (same package)
        System.out.println("defaultVar = " + obj.defaultVar);     // ✅ allowed (same package)

        // System.out.println(obj.privateVar);   // Not allowed (private)
    }
}
