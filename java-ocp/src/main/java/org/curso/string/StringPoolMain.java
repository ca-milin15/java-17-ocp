package org.curso.string;

public class StringPoolMain {

    public static void main(String ... args){

        var name = "Camilo";
        var name2 = "Camilo";
        System.out.println(name == name2); // true. Why? Under this way, the compiler uses the string pool

        var lastName = "Rivera";
        var lastName2 = "Rivera ".trim();
        System.out.println(lastName == lastName2); // false. Why? Trim method is figured out at runtime

        var lastName3 = "Ladino Ladino";
        var lastName4 = "Ladino" + " " + "Ladino";
        System.out.println(lastName3 == lastName4); // true. Why? Concatenation method is figured out at compile time

        // Using intern instruction

        var lastNameIns = "Rivera";
        var lastName2Ins = "Rivera ".trim().intern();
        System.out.println(lastNameIns == lastName2Ins); // true. Why? Intern method indicates to JVM that the string is in the pool


        // If I want the compiler does not use pool, I must use new keyword
        String name100 = "Camilo";
        String name200 = new String("Camilo");
        System.out.println(name100 == name200); // false. Why? The new keyword creates a new object in the heap memory
    }
}
