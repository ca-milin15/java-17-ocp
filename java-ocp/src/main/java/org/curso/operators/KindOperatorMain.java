package org.curso.operators;

public class KindOperatorMain {

    public static void main (String[] args) {
        int result = 2; // 1100011
        System.out.println(result ^ 3); // 1100011


        var string = "Hola";
        System.out.println(string + result * result + "Hola");

        var operand1 = 59;
        var operand2 = 13;
        System.out.println(998 <<8);

        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a++<c);//false && true = false
        System.out.println(a);//10 because second condition is not checked
        System.out.println(a<b&a++<c);//false & true = false
        System.out.println(a);//11 because second condition is checked
        System.out.println(operand1 & operand2);


        System.out.println(9/3);
        System.out.println(9%3);


        var x = 1;
        int y = x++*2 + x *3;
        //        2   +   9
        System.out.println(x);
        System.out.println(y);

        short test = 2;
        test = (short) y;
        System.out.println(test );
    }
}
