package For;

import java.util.Scanner;

public class TablaDeMultiplicar {

    /*
    Objetivo:Escribe un programa en Java que pregunte al usuario por un número x y muestre el resultado de su tabla de multiplicar del 1 al 10.

Entrada:5

Salida
5x1= 5
5x2= 10
5x3= 15
5x4= 20
5x5= 25
5x6= 30
5x7= 35
5x8= 40
5x9= 45
5x10= 50
     */

    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese el numero multiplicar : ");
        int num = scanner.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(num + "x" + i + "="+ (num*i));
        }
        scanner.close();

    }
}
