package anurag;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        
        System.out.println("enter character");
        char ch=sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println( "vowel");
                break;
            default:
                System.out.println("consonant");
    
}
    
    }
}
