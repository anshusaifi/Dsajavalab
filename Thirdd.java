package Anas;

import java.util.Scanner;

public class Thirdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("at 1 multi");
        System.out.println("at 2 division");
        System.out.println("at 3 addition");
        System.out.println("at 4 subtraction");
        System.out.println("Enter your choice");
        int n = sc.nextInt();
        System.out.println("Enter the  1st number");
        int a = sc.nextInt();
        System.out.println("Enter the  2nd number");
        int b = sc.nextInt();

        
              switch (n) {
            case 1:
            System.out.println("answer is  "+(a*b));

                break;

                case 2:
            System.out.println("answer is  "+(a/b));

                break;

                case 3:
            System.out.println("answer is  "+(a+b));


                break;

                case 4:
            System.out.println("answer is  "+(a-b));

                break;
        
            default:
                break;
        }
        


      
    }
}
