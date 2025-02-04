package org.curso.string;

public class StringMethodsMain {

    public static void main(String... args) {

        var name = "Camilo";
        var nameTwo = "sandra";

        System.out.println(name.concat(nameTwo));
        System.out.println(name + nameTwo);

        /* Rules:
        * 1. If both operands are numeric, + means addition
        * 2. If either operand is String, + means concatenation
        * 3. Evaluation is left to right
        */
        var name1 = "victoria";
        System.out.println(name1 + 8); // victoria8
        System.out.println(name1 + 8 + 2); // victoria82
        System.out.println(name1 + (8 + 2)); // victoria10
        System.out.println(name1 + null); // victorianull
        System.out.println(null + name); // nullCamilo
        System.out.println(null + ""); // null
        // System.out.println(8 + 8); // does not compile when I try concatenating a null with a number. Do not matter the order
        // System.out.println(null + 'f'); // does not compile when I try concatenating a null with a char. Do not matter the order
        System.out.println('f' + 8); // 110
        System.out.println('f' + "f"); // ff
        System.out.println('f' + 8L); // 110
        System.out.println('f' + 8f); // 110.0
        System.out.println('f' + 'f'); // 204

        var replaceMethodExample = "Hello World!";
        System.out.println(replaceMethodExample.replace("", " ")); // H e l l o   W o r l d !
        System.out.println(replaceMethodExample.replace('w', '1')); // Hello 1orld!

        var stripExample =  "   Camilo  ";
        System.out.println("|" + stripExample.strip() + "|"); // |Camilo|

        var trimExample =  "   Camilo  ";
        System.out.println("|" + trimExample.trim() + "|"); // |Camilo| -> trim supports unicode

        var stripLeadingExample =  "   Camilo  ";
        System.out.println("|" + stripLeadingExample.stripLeading() + "|"); // |Camilo  |

        var trailingExample =  "   Camilo  ";
        System.out.println("|" + trailingExample.stripTrailing() + "|"); // |   Camilo|

        var indentExample = "Camilo";
        System.out.println(indentExample.stripIndent()); // Camilo\ Rivera
        var indentExample2 = "Camilo \n Rivera";
        System.out.println(indentExample2.indent(2)); // Camilo\ Rivera

        var translateEscape = "Camilo\tRivera";
        System.out.println(translateEscape); // Camilo  Rivera

        var translateEscapeTripleBackSlash = "Camilo\\\tRivera";
        System.out.println(translateEscapeTripleBackSlash); // Camilo\ Rivera

        var formattedString = "Hello %s, welcome to %s!";
        System.out.printf(formattedString + "%n", "Camilo", 7); // Hello Camilo, welcome to Java!
    }
}
