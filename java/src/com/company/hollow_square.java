package com.company;

public class hollow_square {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=4; j++){
                if (i==2 || i==3 ){
                    if (j==2 || j==3){
                        System.out.print(" ");
                    }
                    else
                        System.out.print("*");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
