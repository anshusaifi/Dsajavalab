package anurag;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 10000;
        
        System.out.println("1: CHECK CURREBT BALANCE");
        System.out.println("2:WITHDRAW");
        System.out.println("3:DEPOSIT");
        System.out.println("enter your choice");
        
        int n = sc.nextInt();

        switch (n) {
            case 1:
              System.out.println("Your current balance is:"+amount);
                
                break;

            case 2:
            System.out.println("Enter the money you want to wuthdraw");
             int withdraw = sc.nextInt();
             System.out.println("your withdrwal amount is:"+withdraw);
             System.out.println("your remaining balance is:"+(amount-withdraw));
                break;

             case 3:
             System.out.println("Enter the money u want to deposit");
             int depo = sc.nextInt();
             System.out.println("your current bal is:"+(amount+depo));
               break;
            default:
                break;
        }
        
        

        
    }


    
}
