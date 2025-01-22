package org.curso.operators.assigmentoperation;

public class AssigmentOperationMain {

    public static void main(String[] args) {
        int x = 5;
        int y = x = 4 * (x = 3) * 2 + (x = 1);
        System.out.println(y);

        boolean isOk = false;
        Number number = 0;

        if (isOk = true) {
            System.out.println("Ok");
        } else {
            System.out.println("Not Ok");
        }

    }
}
