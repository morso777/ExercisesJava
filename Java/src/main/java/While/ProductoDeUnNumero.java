package While;

import java.util.Scanner;

public class ProductoDeUnNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número (x): ");
        int x = input.nextInt();
        System.out.print("Ingrese otro número (y): ");
        int y = input.nextInt();

        int result = 0;
        int i = 0;

        while (i < y) {
            result = result + x;
            i++;
        }

        System.out.println(x + "x" + y + "= " + result);
    }

}
