package Anas;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Odd numbers are: ");
        for(int i=1;i<=n;i=i+2){
              System.out.println(+i);
        }
        
        System.out.println("Even numbers upto n are:");
        for(int i=0;i<=n;i=i+2){
            System.out.println(i);
        }
    }
}
