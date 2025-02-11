package StringsOperations;

import java.util.Scanner;

public class SnakeCase {

    public static String SnakeCase(String str) {
        // code goes here
        return str.replaceAll("[^a-zA-Z]+", "_").toLowerCase();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SnakeCase(s.nextLine()));
        s.close();
    }
}


