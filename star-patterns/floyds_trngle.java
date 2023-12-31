package javabasics.src;

import java.util.*;
public class floyds_trngle {
    public static void Floyd_trngle (int num){
        int r = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(r+" ");
                r++;
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]) {
        int num;
        System.out.print("Enter the number of row:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        Floyd_trngle(num);

    }


}