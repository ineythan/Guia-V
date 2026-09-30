package Ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {
        Par<String, Integer> parUno = new Par<>("harrison diaz luque", 21);
        System.out.println(parUno);

        Par<String, String> parDos = new Par<>("neythan luque", "adriana garcell");
        System.out.println(parDos);

        System.out.println("cambiando los valores de parUno");
        parUno.setPrimero("sofia vera");
        parUno.setSegundo(19);
        System.out.println(parUno);

        System.out.println("leyendo los valores de parDos por separado");
        System.out.println(parDos.getPrimero());
        System.out.println(parDos.getSegundo());

        Par<Double, Boolean> parTres = new Par<>(4.5, true);
        System.out.println(parTres);
    }
}