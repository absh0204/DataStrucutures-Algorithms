package javabasics.src;

import java.util.*;
public class bterfly {
    public static void Butter(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for (int j=0;j<(2*n-2*i);j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.print("\n");
            }
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            for (int j=0;j<2*i;j++){
                System.out.print("  ");
            }
            for(int j=n;j>i;j--){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        }

    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        n=sc.nextInt();
        Butter(n);
    }

}

