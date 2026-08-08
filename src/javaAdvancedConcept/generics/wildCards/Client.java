package javaAdvancedConcept.generics.wildCards;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Kartik");
        names.add("Rahul");

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);

        // Unbounded wildcard
        WildcardExample.printList(names);
        WildcardExample.printList(integers);

        // Upper bounded wildcard
        UpperBoundExample.printNumbers(integers);

        // Lower bounded wildcard
        LowerBoundExample.addNumbers(integers);
    }
}
