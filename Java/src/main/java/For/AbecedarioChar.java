package For;

public class AbecedarioChar {

    /*
    Objetivo:Crea un programa en Java que utilice un bucle for y variables char para mostrar las letras del abecedario en mayúsculas.

input: No se requiere entrada
Salida: A B C D E F G H I K L M N O P Q R S T V X Y Z

 */

    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
    }

}
