package anurag;

import java.util.Scanner;

public class SEASON {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("SEASON DETERMINER BY MONTH NUMBER");
         while(true){
         System.out.println("ENTER MONTH NUMBER");
         int n=sc.nextInt();
        switch (n) {
            case 12:
            case 1:
            case 2:
                System.out.println("WINTER");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("SPRING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Invalid Month number");
                break;
            }
        
        
    }
    
}

}
