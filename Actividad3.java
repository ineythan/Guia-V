package Actividades;
public class Actividad3 {

    public static void main(String[] args) {
        String txt1 = "neythan luque";
        String txt2 = new String("neythan luque");
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("comparando enteros iguales");
        System.out.println(IgualGenerico.esIgualA(21, 21));

        System.out.println("comparando enteros distintos");
        System.out.println(IgualGenerico.esIgualA(21, 22));

        System.out.println("comparando decimales iguales");
        System.out.println(IgualGenerico.esIgualA(1.5, 1.5));

        System.out.println("comparando dos textos con el mismo contenido");
        System.out.println(IgualGenerico.esIgualA(txt1, txt2));

        System.out.println("comparando dos nombres distintos del grupo");
        System.out.println(IgualGenerico.esIgualA("adriana garcell", "sofia vera"));

        System.out.println("comparando el mismo objeto contra si mismo");
        System.out.println(IgualGenerico.esIgualA(obj1, obj1));

        System.out.println("comparando dos objetos distintos");
        System.out.println(IgualGenerico.esIgualA(obj1, obj2));

        System.out.println("comparando un entero contra un texto");
        System.out.println(IgualGenerico.esIgualA(21, "21"));

        System.out.println("comparando un texto contra null");
        System.out.println(IgualGenerico.esIgualA("harrison diaz luque", null));

        System.out.println("ahora null contra un texto esto deberia fallar");
        try {
            System.out.println(IgualGenerico.esIgualA(null, "harrison diaz luque"));
        } catch (NullPointerException ex) {
            System.out.println("salto una excepcion de puntero nulo");
        }

        System.out.println("misma prueba pero sin el try catch para ver el error real");
        System.out.println(IgualGenerico.esIgualA(null, "ethan garcell luque"));
    }
}

class IgualGenerico {

    public static <T> boolean esIgualA(T obj1, T obj2) {
        return obj1.equals(obj2);
    }
}