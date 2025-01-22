package org.curso.buildingblock.object;

public class ObjectsMain {

    private String name;

    public ObjectsMain() {
        this.name = "Initializer block";

    }
    { this.name = "Hola";}

    public static void main(String[] args) {
        var obj = new ObjectsMain();
        System.out.println(obj.name);
    }

}
