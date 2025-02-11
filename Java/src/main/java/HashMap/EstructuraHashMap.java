package HashMap;

import java.util.HashMap;

public class EstructuraHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Manzana");
        map.put(2, "Naranja");
        map.put(1, "Pera"); // Sobrescribe el valor asociado a la clave 1
        System.out.println(map); // {1=Pera, 2=Naranja}
    }
}
