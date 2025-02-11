package StringsOperations;

import java.util.Scanner;

public class ReverseFirst {

    public static String FirstReverse(String str) {
        int i;
        String caja = "" ;
        for (i = str.length()-1; i >=0; i--) {
            caja= caja + str.charAt(i);

        }
        return caja;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(FirstReverse(s.nextLine()));
    }
}
