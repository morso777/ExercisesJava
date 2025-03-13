package While;

import java.util.Scanner;

/*
Objetivo:Desarrolla un programa en Java que pida al usuario ingresar un número entero y determine si es un número primo o no.

Un número primo es aquel que solo es divisible por 1 y por sí mismo, y no tiene otros divisores. El programa verificará si el número ingresado cumple con esta condición.

Entrada:7
Salida:Es un número primo

 */

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int x = input.nextInt();
        int divisor = 2;
        boolean esPrimo = true;

        while (divisor < x) {
            if (x % divisor == 0) {
                esPrimo = false;
                break;
            }
            divisor++;
        }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
