package Ejercicios;
import java.util.ArrayList;

public class Ejercicio4 {

    public static void main(String[] args) {
        Contenedor<String, Integer> contenedorNombres = new Contenedor<>();
        contenedorNombres.agregarPar("harrison diaz luque", 21);
        contenedorNombres.agregarPar("neythan luque", 20);
        contenedorNombres.agregarPar("adriana garcell", 22);
        System.out.println("mostrando todos los pares guardados");
        contenedorNombres.mostrarPares();
        System.out.println("obteniendo el par que esta en la posicion 1");
        System.out.println(contenedorNombres.obtenerPar(1));
        System.out.println("cuantos pares hay guardados en total");
        System.out.println(contenedorNombres.obtenerTodosLosPares().size());
        Contenedor<Double, Boolean> contenedorNotas = new Contenedor<>();
        contenedorNotas.agregarPar(15.5, true);
        contenedorNotas.agregarPar(9.0, false);

        System.out.println("mostrando otro contenedor con distinto tipo de datos");
        contenedorNotas.mostrarPares();
    }
}
class Contenedor<F, S> {

    private ArrayList<Par<F, S>> pares;
    public Contenedor() {
        pares = new ArrayList<>();
    }
    public void agregarPar(F primero, S segundo) {
        pares.add(new Par<>(primero, segundo));
    }
    public Par<F, S> obtenerPar(int indice) {
        return pares.get(indice);
    }
    public ArrayList<Par<F, S>> obtenerTodosLosPares() {
        return pares;
    }

    public void mostrarPares() {
        for (Par<F, S> par : pares) {
            System.out.println(par);
        }
    }
}