package javaAdvancedConcept.generics.wildCards;

import java.util.List;

public class UpperBoundExample {
    // Accepts List<Number> or List of any subclass of Number.
    public static void printNumbers(List<? extends Number> numbers) {

        for (Number number : numbers) {
            System.out.println(number);
        }

        // We can safely READ values as Number.
        Number number = numbers.get(0);

        // We cannot add a Number because the exact subtype is unknown.
        // numbers.add(10); // ❌ Not allowed
        // numbers.add(10.5); // ❌ Not allowed
    }

}
