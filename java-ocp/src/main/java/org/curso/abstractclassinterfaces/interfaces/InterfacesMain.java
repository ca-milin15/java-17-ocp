package org.curso.abstractclassinterfaces.interfaces;

public class InterfacesMain implements FruitService, AnimalService {

    public static void main(String[] args) {
    }

    @Override
    public void growth() {
    }

    @Override
    public void eat() {
    }

    @Override
    public int commonMethod() {
        return 1;
    }

    @Override
    public String commonDefaultMethod() {
        return "local impl";
    }



}
