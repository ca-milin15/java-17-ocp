package org.curso.abstractclassinterfaces.interfaces;

public interface AnimalService {

    void eat();
    abstract int commonMethod();
    default String commonDefaultMethod(){
        return "Animal Default Method";
    }
}
