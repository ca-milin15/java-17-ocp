package org.curso.flowcontrol.whileloop;

public class WhileLoopMain {

    public static void main(String... args) {
        classicalWhile();
        whileWithLabels();
    }

    public static void whileWithLabels() {
        int a = 0;
        int b = 0;
        PRIMER_LOOP: while (true) {
            System.out.println(a);
            a++;
            b = 0;

            SEGUNDO_LOOP: while(true) {
                System.out.println(b);
                b++;
                if (b == 10) {
                    break PRIMER_LOOP;
                }
            }
        }
    }

    public static void classicalWhile() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
