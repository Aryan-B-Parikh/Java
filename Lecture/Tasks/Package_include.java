import mul.*;
import add.*;
import sub.*;
import div.*;
public class Package_include{
    public static void main(String[] args) {
        AddPackage a=new AddPackage(10,20);
        SubPackage b=new SubPackage(10,20);
        MulPackage c=new MulPackage(10,20);
        DivPackage d=new DivPackage(10,20);
        a.add();
        b.sub();
        c.mul();
        d.div();
    }
}