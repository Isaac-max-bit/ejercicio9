import java.util.Random;

public class ejercicio5 {
    
    public static void main(String[] args) {
        int mínimo = 1; // Rango mínimo
        int máximo = 100; // Rango máximo
        int cantidadNumeros = 10; // Cantidad de números a generar

        Random random = new Random();
        int[] numerosGenerados = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(máximo - mínimo + 1) + mínimo;
            } while (yaExiste(numerosGenerados, numeroAleatorio, i));

            numerosGenerados[i] = numeroAleatorio;
        }

        System.out.println("Números aleatorios sin repetición:");
        for (int numero : numerosGenerados) {
            System.out.print(numero + " ");
        }
    }

    private static boolean yaExiste(int[] numerosGenerados, int numeroAleatorio, int indiceActual) {
        for (int i = 0; i < indiceActual; i++) {
            if (numerosGenerados[i] == numeroAleatorio) {
                return true;
            }
        }
        return false;
    }
}
