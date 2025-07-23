package Basics.Lab.Lab_Work;

public class Task16_7 {
    public static void main(String[] args) {
        String str1="Aryan";
        String str2="Aryan";
        String str3=new String("Aryan Parikh");
        System.out.println("using == operator");
        System.out.println("Str1 == Str2" + (str1 == str2));
        System.out.println("Str1 == Str3" + (str1 == str3));

        System.out.println("using equals() method");
        System.out.println("Str1.equals(Str2): " + str1.equals(str2));
        System.out.println("Str1.equals(Str3): " + str1.equals(str3));

        String a = "Java";
        String b = "Ja"+"va";
        String c = "Ja";
        String d = (c+"va"+"PI").intern();
        String e = "JavaPI";

        System.out.println("a==b "+ (a == b));
        System.out.println("a==c "+ (a == c));
        System.out.println("a==d "+ (a == d));
        System.out.println("d==e "+ (d == e));

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(c): " + a.equals(c));
        System.out.println("a.equals(d): " + a.equals(d));
        System.out.println("d.equals(e): " + d.equals(e));
    }
}