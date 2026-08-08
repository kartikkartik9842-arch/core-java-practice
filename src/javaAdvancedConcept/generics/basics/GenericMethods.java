package javaAdvancedConcept.generics.basics;


public class GenericMethods {

    // This method has its own type parameter T.
    // T is not related to K or V from the Pair class.
    public static <T> void print(T value) {
        System.out.println(value);
    }

    // T can also be used as the return type.
    public static <T> T getValue(T value) {
        return value;
    }
}