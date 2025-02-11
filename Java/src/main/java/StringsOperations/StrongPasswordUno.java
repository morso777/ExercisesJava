package StringsOperations;

public class StrongPasswordUno {

    public static void main (String[] args){

        String password = "Clave123#$%";

        if (password.contains( (" "))){
            System.out.println("invalid password");
        return;
        }

        boolean hasAtleat8Chars = password.length()>=8;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasdigit = false;
        boolean hasSpecialChar = false;

        for (int i=0; i<password.length(); i++){
            char ch= password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase=true;
            }else if (Character.isLowerCase(ch)){
                hasLowerCase=true;
            }else if (Character.isDigit(ch)){
                hasdigit=true;
            }else {
                hasSpecialChar=true;
            }
        }

        boolean isStrongPassword = hasAtleat8Chars && hasUpperCase && hasLowerCase && hasdigit && hasSpecialChar;

        if (isStrongPassword){
            System.out.println(password + "is a strong password");
        }else{
            System.out.println(password + "is a weak password");
        }
    }
}
