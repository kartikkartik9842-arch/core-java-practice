package javaAdvancedConcept.generics.wildCards;
import java.util.List;

public class WildcardExample {

    // ? means we don't know the exact type of the list.
    // It can be List<String>, List<Integer>, List<Double>, etc.
    public static void printList(List<?> list) {

        for (Object value : list) {
            System.out.println(value);
        }

        // We cannot add a value because the actual type is unknown.
        // list.add("Hello"); // ❌ Not allowed

        // The only thing we can safely add is null.
        list.add(null);
    }

}