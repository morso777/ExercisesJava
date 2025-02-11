package Set;

import java.util.HashMap;
import java.util.HashSet;

public class EstructuraSet {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Manzana");
        set.add("Naranja");
        set.add("Manzana"); // No se añade porque ya existe
        System.out.println(set); // [Naranja, Manzana] (orden no garantizado)
    }
}
