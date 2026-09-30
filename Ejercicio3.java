package Ejercicios;

public class Ejercicio3 {

    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par);
    }

    public static void main(String[] args) {
        Par<String, Integer> parUno = new Par<>("harrison diaz luque", 22);
        imprimirPar(parUno);

        Par<Double, Boolean> parDos = new Par<>(15.8, true);
        imprimirPar(parDos);

        Persona persona = new Persona("neythan luque", 21);
        Par<Persona, Integer> parTres = new Par<>(persona, 2024103045);
        imprimirPar(parTres);
    }
}

class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " edad " + edad;
    }
}