package Anas;

import java.util.Scanner;

public class Newff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;

        while(n>0){
            n=n%10;
            res = res+n*n*n;
            n=n/10;
        }
        

        System.out.println(res);
    }
}
