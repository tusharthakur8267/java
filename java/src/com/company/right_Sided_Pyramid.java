package com.company;

public class right_Sided_Pyramid {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                if (j>=11-i){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
