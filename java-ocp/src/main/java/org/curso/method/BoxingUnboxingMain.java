package org.curso.method;

public class BoxingUnboxingMain {

    public static void main(String... args) {
        // Boxing: converting a primitive into ist wrapper class
        Integer b = Integer.valueOf(3);
        System.out.println(b);
        // Unboxing: converting a wrapper class into its primitive
        System.out.println(b.intValue());

        Long x = 10L;
    }
}
