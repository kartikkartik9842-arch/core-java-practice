package javaAdvancedConcept.generics.basics;

public class Client {

    public static void main(String[] args) {

        // K -> String
        // V -> Integer
        Pair<String, Integer> pair = new Pair<>("Age", 26);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        // The compiler figures out T from the argument.
        GenericMethods.print("Hello");
        GenericMethods.print(100);
        GenericMethods.print(10.5);

        String name = GenericMethods.getValue("Kartik");
        Integer age = GenericMethods.getValue(26);

        System.out.println(name);
        System.out.println(age);
    }
}