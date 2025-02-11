package StringsOperations;

import java.util.Scanner;

public class Reversed {
    public static String reversed(String str) {
        String alreves = "" ;
        for (int i = str.length()-1; i >=0; i--) {
            char ch= str.charAt(i);
            alreves+=ch;
        }
        return alreves;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(reversed(s.nextLine()));
    }
}
