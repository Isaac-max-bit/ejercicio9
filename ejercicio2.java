import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabla del " + numero);
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                int resultado = numero * multiplicador;
                System.out.println(numero + " x " + multiplicador + " = " + resultado);
            }
            System.out.println();
        }
    }
}
