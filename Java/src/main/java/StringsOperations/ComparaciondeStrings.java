package StringsOperations;

public class ComparaciondeStrings {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        // Comparar cadenas
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("Igual (case-sensitive): " + isEqual);
        System.out.println("Igual (case-insensitive): " + isEqualIgnoreCase);
    }
}
