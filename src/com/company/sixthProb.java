package com.company;

import java.util.Scanner;

public class sixthProb {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("kitne triangle chahiye aapko?");
        int a = obj.nextInt();
        bnade(a);
    }

    static void bnade(int b){
        for(int row=0;row<2*b; row++){
            if(row<b){
                for(int col=0;col<row+1; col++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            else{
                for(int col=0;col<2*b-row-1; col++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }

        }
    }



}
