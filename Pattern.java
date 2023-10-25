package Anas;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number");
        int n =sc.nextInt();




        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        





        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1||i==5||j==1||j==5){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.print("\n");
        // }





        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }




        // for(int i=0;i<=4;i++){
        //     for(int j=0;j<=i;j++){
        //        System.out.print("  ");
        //     }
            
        //         for(int k=0;k<=4;k++){
        //             System.out.print("* ");
        //         }
            
        //     System.out.println();
        // }





        // for(int i=0;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }






        // for(int i=0;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print("  ");
        //     }
        //     for(int a=0;a<=n;a++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        





    // for(int i=0;i<=n;i++){
    //     for(int j=0;j<i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int a=0;a<=n;a++){
    //         if(i==0||i==n||a==0||a==n){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }






    // for(int i=0;i<=n;i++){
    //     for(int j=0;j<=i;j++){
    //         if(i==1||i==n||j==i||j==0){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }




    for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            if(j==4){
                System.out.print("+ ");
            }
            else{
                System.out.print("  ");
            }
        }
    }

    }
}
