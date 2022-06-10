package com.company;

import java.util.Scanner;

public class FourthProb {
    public static void main(String[] args) {
        System.out.println("what is the input you want?");
        Scanner obj1=new Scanner(System.in);
        int a= obj1.nextInt();
        Pattern(a);
    }
    static void Pattern(int num){
        for(int row=1; row<=num; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }
}
