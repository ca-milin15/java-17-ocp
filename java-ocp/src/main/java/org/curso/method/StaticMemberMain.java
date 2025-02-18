package org.curso.method;

public class StaticMemberMain {

    public static void main(String... args) {
        MetalBlock.print();
    }

    public static class MetalBlock {

        public static final double MASS_IN_KILOS;
        public static final double VOLUME_IN_CUBIC_METERS;
        public static final double DENSITY;

        //Static block will be executed in order from top to bottom
        static {
            MASS_IN_KILOS = 0.1;
            VOLUME_IN_CUBIC_METERS = 0.1;
        }

        static {
            DENSITY = MASS_IN_KILOS / VOLUME_IN_CUBIC_METERS;
        }

        private static void print(){
            System.out.println("Density: " + DENSITY);
        }
    }
}
