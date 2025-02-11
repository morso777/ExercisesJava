package CodeChallenge;

import java.util.Scanner;

public class QuestionsMarks {

    //funciona ok
    public static String QuestionsMarks(String str) {
        boolean validPairFound = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int num1 = Character.getNumericValue(str.charAt(i));
                int questionMarksCount = 0;

                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '?') {
                        questionMarksCount++;
                    } else if (Character.isDigit(str.charAt(j))) {
                        int num2 = Character.getNumericValue(str.charAt(j));
                        if (num1 + num2 == 10) {
                            if (questionMarksCount != 3) {
                                return "false";
                            }
                            validPairFound = true;
                        }
                        break;
                    }
                }
            }
        }
        return validPairFound ? "true" : "false";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }
}


