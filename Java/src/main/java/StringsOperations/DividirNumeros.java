package StringsOperations;
import java.util.Scanner;

public class DividirNumeros {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numerador;
            int denominador;

            // Solicitar el numerador
            System.out.print("Ingrese el numerador (1-10): ");
            numerador = scanner.nextInt();

            // Solicitar el denominador
            System.out.print("Ingrese el denominador (1-10): ");
            denominador = scanner.nextInt();

            // Verificar si el denominador es cero
            if (denominador == 0) {
                System.out.println("Error: División por cero no es permitida.");
            } else {
                // Realizar la división
                double resultado = (double) numerador / denominador;
                System.out.println("El resultado de la división es: " + resultado);
            }
            // Cerrar el escáner
            scanner.close();
        }
    }


