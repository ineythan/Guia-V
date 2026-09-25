package Actividades;

public class Actividad2 {

    public static void main(String[] args) {
        String[] nombres = {"harrison diaz luque", "neythan luque", "adriana garcell",
                "sofia vera", "eunice diaz vera", "ethan garcell luque"};
        Pila<String> pilaNombres = new Pila<>(5);

        System.out.println("metiendo nombres a la pila");
        try {
            for (String n : nombres) {
                System.out.println(n);
                pilaNombres.push(n);
            }
        } catch (ExcepcionPilaLlena ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("buscando algunos nombres con contains");
        System.out.println("harrison diaz luque -> " + pilaNombres.contains("harrison diaz luque"));
        System.out.println("eunice diaz vera -> " + pilaNombres.contains("eunice diaz vera"));
        System.out.println("ethan garcell luque -> " + pilaNombres.contains("ethan garcell luque"));

        System.out.println("sacando todos los nombres");
        for (int i = 0; i < 5; i++) {
            System.out.println(pilaNombres.pop());
        }

        System.out.println("buscando con la pila ya vacia");
        System.out.println("harrison diaz luque -> " + pilaNombres.contains("harrison diaz luque"));

        System.out.println("intentando sacar de una pila vacia");
        try {
            pilaNombres.pop();
        } catch (ExcepcionPilaVacia ex) {
            System.out.println(ex.getMessage());
        }

        Pila<Integer> pilaNum = new Pila<>();
        pilaNum.push(10);
        pilaNum.push(20);
        pilaNum.push(30);

        System.out.println("probando contains con numeros");
        System.out.println("el 20 esta -> " + pilaNum.contains(20));
        System.out.println("el 99 esta -> " + pilaNum.contains(99));
        System.out.println("el tope sigue siendo " + pilaNum.pop());
    }
}

class Pila<E> {

    private final int tamanio;
    private int superior;
    private E[] elementos;

    public Pila() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public Pila(int s) {
        tamanio = s > 0 ? s : 10;
        superior = -1;
        elementos = (E[]) new Object[tamanio];
    }

    public void push(E valorAMeter) {
        if (superior == tamanio - 1) {
            throw new ExcepcionPilaLlena("la pila esta llena no se puede meter " + valorAMeter);
        }
        elementos[++superior] = valorAMeter;
    }

    public E pop() {
        if (superior == -1) {
            throw new ExcepcionPilaVacia("pila vacia no se puede sacar");
        }
        return elementos[superior--];
    }

    public boolean contains(E elemento) {
        for (int i = superior; i >= 0; i--) {
            if (elementos[i] == null ? elemento == null : elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
}

class ExcepcionPilaLlena extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionPilaLlena(String msg) {
        super(msg);
    }
}

class ExcepcionPilaVacia extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionPilaVacia(String msg) {
        super(msg);
    }
}