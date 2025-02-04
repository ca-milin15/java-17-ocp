package org.curso.flowcontrol.switchcase;


public enum SaludoEnum {

    HOLA ("Hola"),
    BUEN_DIA("Buen dia"),
    HASTA_LUEGO("Hasta luego");

    String descripcion;

    SaludoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
