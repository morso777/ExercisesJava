package For;

public class EjercicioFor {

    public static void main (String [] args) {
        String input = "qwerty7890";
        StringBuilder numbers = new StringBuilder();
        for (int i=0; i<input.length(); i++){
            char currentchar= input.charAt(i);
            if (Character.isDigit(currentchar)){
                numbers.append(currentchar);
            }
        }
        System.out.println("numbers is  :" + numbers.toString());
    }
}
