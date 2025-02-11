package CodeChallenge;

public class PiramidNumbersInverted {

    /*print piramid inverted
12345
1234
123
12
1
 */

    public static void main(String[] args) {
        int n = 5; // Tamaño de la pirámide

        for (int i = n; i >= 1; i--) { // Controla el número de líneas
            // Imprimir espacios iniciales para centrar la pirámide
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            // Imprimir los números de 1 a i
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }

            System.out.println(); // Salto de línea
        }
    }
}
