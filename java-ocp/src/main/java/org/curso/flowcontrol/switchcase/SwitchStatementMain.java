package org.curso.flowcontrol.switchcase;

public class SwitchStatementMain {

    public static void main(String... args) {

        int a = 0;
        var saludo = switch(a) {
            case 0, 1 -> "Hola";
            case 2 -> "Buena noche";
            default -> "Adios";
        };

        System.out.println(saludo);

        var saludoEnum = switch (SaludoEnum.HOLA) {
            case HOLA -> SaludoEnum.HOLA.getDescripcion();
            case BUEN_DIA -> SaludoEnum.BUEN_DIA.getDescripcion();
            case HASTA_LUEGO -> SaludoEnum.HASTA_LUEGO.getDescripcion();


        };
        System.out.println(saludoEnum);
    }
}
