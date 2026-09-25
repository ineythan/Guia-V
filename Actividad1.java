package Actividades;

public class Actividad1 {

    public static <E> void printArreglo(E[] arr) {
        for (E dato : arr) {
            System.out.printf("%s ", dato);
        }
        System.out.println();
    }

    public static <E> int printArreglo(E[] arr, int idxIni, int idxFin) {
        if (idxIni < 0 || idxFin >= arr.length || idxFin <= idxIni) {
            throw new InvalidSubscriptException("indices invalidos ini " + idxIni + " fin " + idxFin + " tam " + arr.length);
        }
        int cont = 0;
        for (int i = idxIni; i <= idxFin; i++) {
            System.out.printf("%s ", arr[i]);
            cont++;
        }
        System.out.println();
        return cont;
    }

    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5, 6};
        Double[] arrDob = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] arrChar = {'h', 'n', 'a', 's', 'e', 'e'};
        String[] arrNombres = {"harrison diaz luque", "neythan luque", "adriana garcell",
                "sofia vera", "eunice diaz vera", "ethan garcell luque"};

        System.out.println("arreglo completo de enteros");
        printArreglo(arrInt);

        System.out.println("arreglo completo de decimales");
        printArreglo(arrDob);

        System.out.println("arreglo completo de caracteres");
        printArreglo(arrChar);

        System.out.println("arreglo completo con los nombres del grupo");
        printArreglo(arrNombres);

        System.out.println("ahora solo un tramo del arreglo de enteros del 1 al 3");
        int c1 = printArreglo(arrInt, 1, 3);
        System.out.println("se imprimieron " + c1 + " datos");

        System.out.println("tramo del arreglo de decimales del 2 al 6");
        int c2 = printArreglo(arrDob, 2, 6);
        System.out.println("se imprimieron " + c2 + " datos");

        System.out.println("tramo del arreglo de nombres del 0 al 2");
        int c3 = printArreglo(arrNombres, 0, 2);
        System.out.println("se imprimieron " + c3 + " datos");

        System.out.println("probando con un indice fuera de rango");
        try {
            printArreglo(arrChar, 1, 9);
        } catch (InvalidSubscriptException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("probando con indice inferior negativo");
        try {
            printArreglo(arrInt, -1, 3);
        } catch (InvalidSubscriptException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("probando cuando el superior es igual al inferior");
        try {
            printArreglo(arrNombres, 4, 4);
        } catch (InvalidSubscriptException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class InvalidSubscriptException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidSubscriptException(String msg) {
        super(msg);
    }
}