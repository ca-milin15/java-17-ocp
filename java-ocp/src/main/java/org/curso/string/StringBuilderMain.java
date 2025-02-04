package org.curso.string;

public class StringBuilderMain {

    public static void main(String[] args) {
        var stringBuilder = new StringBuilder("Camilo");
        stringBuilder.insert(6, " ").insert(7, "Rivera");
        System.out.println(stringBuilder); // Camilo Rivera
        stringBuilder.delete(6, 7);
        System.out.println(stringBuilder); // CamiloRivera

        var stringBuilder2 = new StringBuilder("Camilo");
        stringBuilder2.insert(0, "1");
        System.out.println(stringBuilder2); // Camilo Rivera

        var stringBuilder1 = new StringBuilder("Prueba");
        stringBuilder1.deleteCharAt(1);
        System.out.println(stringBuilder1); // Pueba
    }
}
