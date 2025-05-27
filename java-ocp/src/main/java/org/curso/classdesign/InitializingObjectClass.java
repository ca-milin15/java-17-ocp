package main.java.org.curso.classdesign;

class Mammal {
    static { System.out.println(""); } // 1
    static { System.out.println("Static Mammal innitialization block code"); } // 2
    { System.out.println("Mammal innitialization block code"); } // 4
}


/*
 * Execution order when an object is instantiated:
 * 
 * 1. Initialize the class if it was not already initialized
 * 2. If there is a superclass, initialize superclass
 * 3. Process all instance variable declarations
 * 4. Process all instance initializers. (First the static initializer)
 * 5. Initialize the constructor
*/
public class InitializingObjectClass extends Mammal{

    public String name = "InheritingMembersClass";
    private static int index = 0;
    static { System.out.println(index); } // 3

    { System.out.println("InheritingMembersClass innitialization block code"); } // 5

    public static void main(String... args) {
        var inheritingMembersClass = new InitializingObjectClass();
        { System.out.println("InheritingMembersClass instanced"); }// 6
        System.out.println(inheritingMembersClass); // 7
    }
}
