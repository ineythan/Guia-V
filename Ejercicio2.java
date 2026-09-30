package Ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {
        Par<String, Integer> parA = new Par<>("harrison diaz luque", 21);
        Par<String, Integer> parB = new Par<>("harrison diaz luque", 21);
        Par<String, Integer> parC = new Par<>("neythan luque", 21);
        Par<String, Integer> parD = new Par<>("harrison diaz luque", 30);

        System.out.println("comparando parA con parB con los mismos valores");
        System.out.println(parA.esIgual(parB));

        System.out.println("comparando parA con parC que tiene otro primero");
        System.out.println(parA.esIgual(parC));

        System.out.println("comparando parA con parD que tiene otro segundo");
        System.out.println(parA.esIgual(parD));

        Par<Double, Boolean> parE = new Par<>(4.5, true);
        Par<Double, Boolean> parF = new Par<>(4.5, true);
        System.out.println("comparando parE con parF con otro tipo de datos");
        System.out.println(parE.esIgual(parF));

        System.out.println("comparando parA contra null");
        System.out.println(parA.esIgual(null));
    }
}