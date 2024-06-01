public class ejercicio4 {
    
    public static void main(String[] args) {
        int filas = 5; // Número de filas del diamante

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" "); // Espacios a la izquierda
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Asteriscos del centro
            }
            System.out.println();
        }

        for (int i = filas - 1; i >= 1; i--) {
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" "); // Espacios a la izquierda
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // Asteriscos del centro
            }
            System.out.println();
        }
    }
}
