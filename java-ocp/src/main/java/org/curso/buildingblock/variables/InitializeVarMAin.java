package org.curso.buildingblock.variables;

public class InitializeVarMAin {

    public static void main(String[] args) {
        String someValue = "1";
        int value;

        if(args[0].isEmpty()) value = 1;
        var var = "new for me";
        System.out.println(var);
        System.gc();
    }

    public static void doesNotCom(boolean arg) {
        int value;
        if(arg) value = 1;
    }
}
