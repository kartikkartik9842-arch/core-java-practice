package Oops.Polymorphism;

public class A {
    public void sayAnything(String name) {
        System.out.println(name);
    }

    public int sayAnything(int age) {
        System.out.println(age);
        return age;
    }

    public void sayAnything(double age) {
        System.out.println(age);
    }

    //not alowed because signature is same as first method
//    public void sayAnything(String age) {
//        System.out.println(age);
//    }

    //not alowed because signature is same as first method and returntype doesnt
    //matter in method overloading
//    public int sayAnything(String age) {
//        return age;
//    }

}
