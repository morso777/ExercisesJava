package StringsOperations;

public class DividirNumeros2 {

        public static void main(String[] args) {
            // Valores fijos para el numerador y el denominador
            int numerador = 8; // Puedes cambiar este valor entre 1 y 10
            int denominador = 2; // Puedes cambiar este valor entre 1 y 10

            // Verificar si el denominador es cero
            if (denominador == 0) {
                System.out.println("Error: División por cero no es permitida.");
            } else {
                // Realizar la división
                double resultado = (double) numerador / denominador;
                System.out.println("El resultado de la división es: " + resultado);
            }
        }
    }
