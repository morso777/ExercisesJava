package CodeChallenge;

import java.util.*;
import java.io.*;

public class FindIntersection {

    //no funciona en intellij pero si en coderbye
         public static String FindIntersection(String[] strArr) {

            String str1 = strArr[0];
            String str2 = strArr[1];
            String result = "";
            for(String chk: str1.split(", ")){
                for(String chk2: str2.split(", ")){
                    if(chk.equals(chk2)){
                        if(result.length()==0){
                            result+=chk;
                        }
                        else {
                            result+=","+chk;
                        }
                    }
                }
            }
            if(result.isEmpty())
                return "false";
            return result;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(FindIntersection(new String[]{s.nextLine()}));
        }

    }
