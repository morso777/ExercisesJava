package StringsOperations;

import java.util.Arrays;

public class ArrayExploration {


    public static void main(String [] args){

            // 1. Create an Array
            double[] numbers = {12, 45.5, 78, 33, 9.8};

            // 2. Access and print
            System.out.println("First element: " + numbers[0]);
            System.out.println("Last element: " + numbers[numbers.length - 1]);

            // 3. Reverse Order
            System.out.println("Numbers in reverse order:");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }

            // 4. Bonus: Element count
            System.out.println("Total number of elements: " + numbers.length);
        }
    }

