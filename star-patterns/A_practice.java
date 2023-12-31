package javabasics.src;
import java.util.*;
public class A_practice {
    public static void Butter_fly(int b){
        int count=0,flag=0;;
        for(int i=1;i<=b;i++){
            for (int j=0;j<2*b;j++){
                if (j<i){
                    System.out.print("*");
                }
                else if(j>=i && j<=((2*b)-(2*i))+count) {//,2b=8,2i=2,4
                    System.out.print(" ");
                }
                else if(j<2*b)
                    System.out.print("*");
            }
            System.out.print("\n");
            count++;
        }
        for(int k=b;k>=1;k--){
            for (int j=0;j<2*b;j++){
                if (j<k){
                    System.out.print("*");
                }
                else if(j>=k && j<=((2*b)-(2*k))-flag) {//,2b=8,2i=8,6,4,2
                    System.out.print(" ");
                }
                else if(j<2*b)
                    System.out.print("*");
            }
            System.out.print("\n");
            flag++;
        }
    }
    public static void main(String args[]){
        System.out.print("PROGRAM FOR PRINTING BUTTERFLY STAR PATTERN:-\nEnter the number of rows:-");
        Scanner sc=new Scanner(System.in);
        int a=4;
        System.out.print("\n");
        //a=sc.nextInt();
        Butter_fly(a);


    }
}