import java.util.Scanner;

/**
 * SaludoPersonal
 */
public class SaludoPersonal {

    public static void main(String[] args) {
        var entrada = new Scanner (System.in);
        System.out.println("Hola por favor ingresar tu nombre");
        var nombre = entrada.nextLine();

        System.out.println(nombre + ", bienvenido al curso de programacion  en java!! ");

    }
}