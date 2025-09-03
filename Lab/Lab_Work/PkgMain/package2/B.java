package package2;

import package1.A;

public class B extends A {
    public void accessFromSubclass() {
        System.out.println("Inside class B (subclass in another package):");
        System.out.println("publicVar = " + publicVar);   // ✅ allowed
        System.out.println("protectedVar = " + protectedVar); // ✅ allowed (subclass)

        // System.out.println(defaultVar);   // Not allowed (different package)
        // System.out.println(privateVar);   // Not allowed (private)
    }
}