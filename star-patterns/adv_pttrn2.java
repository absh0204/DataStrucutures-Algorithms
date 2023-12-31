package javabasics.src;

import java.util.*;
public class adv_pttrn2 {
    public static void Numberpttern(int size){
        //  numbers type pattern
        int num=1;
        for (int i=0;i<size;i++){
            for (int j=0;j<(size-i-1);j++){
                System.out.print(" ");
            }
            for (int j=0;j<=(i);j++){
                System.out.print(num);
                num++;
            }
            System.out.print("\n");
            num=1;
        }
    }
    public static void main(String args[]){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows for Star pattern:");
        n=sc.nextInt();
        System.out.print("Enter rows for number pattern:");
        m=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<(n-i-1);j++){
                System.out.print("  ");
            }
            for (int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        Numberpttern(m);
        Number2pattern(m);

    }
    public static void Number2pattern(int n){
        int num=1;
        for (int i=5;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print(num);
                num++;
            }
            System.out.print("\n");
            num=1;
        }
}
}
