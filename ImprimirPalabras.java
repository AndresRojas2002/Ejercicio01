import java.util.Scanner;

/**
 * ImprimirPalabras
 */
public class ImprimirPalabras {

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("por favor introduzca 3 palabras");

        System.out.println("Introduzca la palabra 1");
        var p1 = entrada.nextLine();

        System.out.println("Introduzca la palabra 2");
        var p2 = entrada.nextLine();

        System.out.println("Introduzca la palabra 3");
        var p3 = entrada.nextLine();

        System.out.println(p1 + " " + p2 + " " + p3);

    
    }
}