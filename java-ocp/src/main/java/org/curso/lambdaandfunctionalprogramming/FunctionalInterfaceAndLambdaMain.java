package org.curso.lambdaandfunctionalprogramming;

public class FunctionalInterfaceAndLambdaMain {

    public static void main (String[] args) {

        // This way only works if the interface have one method
        Animal animal = (voz) -> System.out.println(voz);
        animal.speak("Hola");
    }
}
