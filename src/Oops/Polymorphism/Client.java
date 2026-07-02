package Oops.Polymorphism;

public class Client {
    public static void main(String[] args) {

        B b1 = new B();
        b1.doSomething();
        // Output: doSomething B
        // Compile time: Reference type (B) is checked and method is found.
        // Runtime: Object is of type B, so B's doSomething() is executed.

        B b2 = new C();
        b2.doSomething();
        // Output: doSomething B
        // Compile time: Reference type (B) is checked and method is found.
        // Runtime: C does not override doSomething(), so the inherited method
        // from B is executed.

        B b3 = new D();
        b3.doSomething();
        // Output: doSomething D
        // Compile time: Reference type (B) is checked and method is found.
        // Runtime: D overrides doSomething(), so D's implementation is executed.
    }
}