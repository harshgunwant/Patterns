package com.company;

import java.util.Scanner;

public class ThirdProb {
    public static void main(String[] args) {
        System.out.println("what is the input you want?");
        Scanner obj1=new Scanner(System.in);
        int a= obj1.nextInt();
        Pattern(a);
    }
    static void Pattern(int number){
        for(int row=0;row<number;row++){
            for(int col=0;col<number-row;col++){
                System.out.print("*");
            }
            //for new line
            System.out.println(" ");
        }

    }
}
