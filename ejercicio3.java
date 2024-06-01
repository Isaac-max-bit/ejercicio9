public class ejercicio3 {
    
    public static void main(String[] args) {
        int[] numeros = {10, 25, 32, 7, 99};
        int numeroABuscar = 32;
        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroABuscar) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroABuscar + " sí se encuentra en el arreglo.");
        } else {
            System.out.println("El número " + numeroABuscar + " no se encuentra en el arreglo.");
        }
    }
}
