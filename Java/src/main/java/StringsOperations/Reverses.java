package StringsOperations;

public class Reverses {

    public static void main(String [] str) {
        reverseUno();
        reverseDos();
        System.out.println("reverseTres "+ reverseTres("abc123"));
}


public static void reverseUno(){
    String cadena= "abc123";
    StringBuilder alreves = new StringBuilder();
    for (int i = cadena.length()-1; i >=0; i--) {
        char ch= cadena.charAt(i);
        alreves.append(ch);
    }
    System.out.println("reverseUno "+ alreves);
}

    public static void reverseDos(){
        String str= "abc123";
        String alreves = "" ;
        for (int i = str.length()-1; i >=0; i--) {
            char ch= str.charAt(i);
            alreves+=ch;
        }
        System.out.println("reverseUno "+ alreves);
    }

    public static String reverseTres(String str) {
        String alreves = "" ;
        for (int i = str.length()-1; i >=0; i--) {
            char ch= str.charAt(i);
            alreves+=ch;
        }
        return alreves;
    }


}