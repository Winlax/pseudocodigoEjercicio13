import java.util.*;

public class Arreglo13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double total;
        double numero1, numero2;
        String respuesta;

        do {

            System.out.println("Que operacion desea realizar?");
            System.out.println("Opciones: Suma(a) Dividir(b) Salir(s)");
            respuesta = teclado.next();

            if ("a".equalsIgnoreCase(respuesta)) {

                System.out.println("Ingrese un numero");
                numero1 = teclado.nextDouble();

                System.out.println("Ingrese otro numero");
                numero2 = teclado.nextDouble();

                total = numero1 + numero2;

                System.out.println("La suma es: "+total);

            }

            if ("b".equalsIgnoreCase(respuesta)) {

                System.out.println("Ingrese numerador o numero que desea dividir:");
                numero1 = teclado.nextDouble();

                System.out.println("Ingrese denominador o en cuantas partes desea dividir el otro numero");
                numero2 = teclado.nextDouble();

                if (numero2 == 0) {
                    System.out.println("No se puede dividir entre 0...");
                } else {
                    total = numero1 / numero2;
                    System.out.println("El resultado es: "+total);
                }

            }

            if (!"a".equalsIgnoreCase(respuesta) && !"b".equalsIgnoreCase(respuesta) && !"s".equalsIgnoreCase(respuesta)) {
                System.out.println("Debe ingresar una de las opciones disponibles...");
            }

        } while (!"s".equalsIgnoreCase(respuesta));
    }
}