package javaAdvancedConcept.generics.wildCards;

import java.util.List;

public class LowerBoundExample {
    // Accepts List<Integer>, List<Number>, or List<Object>.
    public static void addNumbers(List<? super Integer> numbers) {

        // We can safely add Integer values.
        numbers.add(10);
        numbers.add(20);

        // Reading as Integer is not safe because the actual list
        // could be List<Object> or List<Number>.
        // Integer value = numbers.get(0); // ❌ Not allowed

        Object value = numbers.get(0);
        System.out.println(value);
    }
}
