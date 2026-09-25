package Actividades;
public class Actividad4 {

    public static void main(String[] args) {
        Pila<String> pilaA = new Pila<>();
        pilaA.push("harrison diaz luque");
        pilaA.push("neythan luque");
        pilaA.push("adriana garcell");

        Pila<String> pilaB = new Pila<>();
        pilaB.push("harrison diaz luque");
        pilaB.push("neythan luque");
        pilaB.push("adriana garcell");

        Pila<String> pilaC = new Pila<>();
        pilaC.push("adriana garcell");
        pilaC.push("neythan luque");
        pilaC.push("harrison diaz luque");

        Pila<String> pilaD = new Pila<>();
        pilaD.push("harrison diaz luque");
        pilaD.push("neythan luque");

        System.out.println("comparando pilaA con pilaB mismo contenido y mismo orden");
        System.out.println(pilaA.esIgual(pilaB));

        System.out.println("comparando pilaA con pilaC mismos elementos pero otro orden");
        System.out.println(pilaA.esIgual(pilaC));

        System.out.println("comparando pilaA con pilaD que tiene menos elementos");
        System.out.println(pilaA.esIgual(pilaD));

        System.out.println("sacando todo de pilaA para confirmar que esIgual no la toco");
        System.out.println(pilaA.pop());
        System.out.println(pilaA.pop());
        System.out.println(pilaA.pop());

        System.out.println("sacando todo de pilaB para confirmar lo mismo");
        System.out.println(pilaB.pop());
        System.out.println(pilaB.pop());
        System.out.println(pilaB.pop());

        Pila<Integer> pilaNum1 = new Pila<>();
        pilaNum1.push(10);
        pilaNum1.push(20);

        Pila<Integer> pilaNum2 = new Pila<>();
        pilaNum2.push(10);
        pilaNum2.push(20);

        System.out.println("comparando dos pilas de numeros con el mismo contenido");
        System.out.println(pilaNum1.esIgual(pilaNum2));
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

    public boolean esIgual(Pila<E> otraPila) {
        if (otraPila == null || this.superior != otraPila.superior) {
            return false;
        }
        for (int i = 0; i <= this.superior; i++) {
            E miDato = this.elementos[i];
            E suDato = otraPila.elementos[i];
            boolean sonIguales = miDato == null ? suDato == null : miDato.equals(suDato);
            if (!sonIguales) {
                return false;
            }
        }
        return true;
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