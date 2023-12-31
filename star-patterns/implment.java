package javabasics.src;

import java.util.*;
public class implment {
    public static void main(String args[]){
        System.out.print("Odd and Even program.\nENTER THE NUMBER:-");
        Scanner sc=new Scanner(System.in);
        int a,last,rev;
        int rev1=0;
//        a=sc.nextInt();
//        if (a%2==0){
//            System.out.print("Even number");
//
//        }
//        else
//            System.out.print("Odd number");
        System.out.print("Reverse of a number.\nEnter the number:- ");
        a=sc.nextInt();
//        System.out.print("Reverse of the number entered by method 1 is-");
//        while(a>0){
//            rev=a%10;
//            a=a/10;
//            System.out.print(rev);
//        }

        //System.out.print("\n");
        //saving in the original ones
        System.out.print("Reverse of the number entered by method 2 is-");

        while(a>0){
            last=a%10;
            a=a/10;
            rev1=(rev1*10)+last;
        }
        System.out.print(rev1);
    }
}


