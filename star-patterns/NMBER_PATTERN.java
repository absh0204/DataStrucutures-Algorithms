package javabasics.src;

import java.util.*;
public class NMBER_PATTERN {
    public static void numberpattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int j=0;j<(2*i)-1;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
    public static void numberpattern2(int n){
        for (int i=1;i<=n;i++){
            for (int k=n;k>i;k--){
                System.out.print("  ");
            }
            for (int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            for (int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        int n=5;
        System.out.print("Numbet pattern 1============================\n");
        numberpattern1(n);
        System.out.print("Numbet pattern 2============================\n");
        numberpattern2(n);
    }
}
