package javabasics.src;

import java.util.*;
public class bsicpttern {
    public static void main(String args[]) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Pattern 1:\nEnter rows:-");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("Pattern 2:\n");
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("Pattern 3:\n");
        for (int i=0;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(j+" ");
        }
            System.out.print("\n");
    }
        char ch='A';
        System.out.print("Pattern 4:\n");
        for (int i=0;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.print("\n");
        }
}
}