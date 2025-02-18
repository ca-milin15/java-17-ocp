package org.curso.method;

public class OverLoadingMain {

    public static void main(String... args) {
        // This means you have multiples methods with the same name but different parameter list
        greet();
        greet("Hello");
        greet((short) 1);

        // Java will find to match in primitive type first,
        // then wrapper and then superclass rounding the top of the reference

        greet((short) 1);
    }

    public static void greet(Number value){
        System.out.println("Hello Number");
    }

    public static void greet(Long value){
        System.out.println("Hello Long");
    }

    public static void greet(byte value){
        System.out.println("Hello byte");
    }

    public static void greet(){
        System.out.println("Hello!");
    }

    public static void greet(String greet){
        System.out.println(greet);
    }

}
