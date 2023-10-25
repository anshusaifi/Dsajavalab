package anurag;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while(true){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number");
    float number1 = sc.nextFloat();

    System.out.println("Enter second number");
    float number2 = sc.nextFloat();
        System.out.println("1: FOR ADDITION");
        System.out.println("2: FOR SUBSTRACTION");
        System.out.println("3: FOR MULTIPICATION");
        System.out.println("4: FOR DIVISION");
        int n = sc.nextInt();

        switch (n) {
            case 1:
            float result = number1 + number2;
              System.out.println("ADDITION OF THE NUMBERS ARE"+result);
              break;

            case 2:
            float result2 = number1 - number2;
             System.out.println("SUBSTRACTION OF THE NUMBERS ARE"+result2);
                break;

             case 3:
              float result3 = number1 * number2;
             System.out.println("MULTIPLICATION OF THE NUMBERS ARE"+result3);
               break;
               case 4:
              float result4 = number1 / number2;
             System.out.println("MULTIPLICATION OF THE NUMBERS ARE"+result4);
            default:
                break;
        }
    }
    
}
}
