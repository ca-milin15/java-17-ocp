package org.curso.abstractclassinterfaces.interfaces;

public abstract interface FruitService {

    abstract void growth();
    abstract int commonMethod();
    default String commonDefaultMethod(){
        return "Fruit Default Method";
    }

}
