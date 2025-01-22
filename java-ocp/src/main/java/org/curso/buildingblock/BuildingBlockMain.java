package org.curso.buildingblock;

import java.util.*;

public class BuildingBlockMain {

    public static void main(String[] args) {
        double value = 1; // Double type is bigger data type
        System.out.println(String.join(", ", args));
    }
}

class BuildingBlockMainTwo {

    public static void main(String args[]) {
        float value = 2.1f; // this type is one less than double
        System.out.println(value);
    }

}

class BuildingBlockMainThree {

    public static void main(String... args) {
        double value = 3;
        System.out.println(value);
    }

}

class BuildingBlockMainFour {

    public static final void main(String[] args) {
        double value = 3;
        System.out.println(value);
    }

}