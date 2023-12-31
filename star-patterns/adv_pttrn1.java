package javabasics.src;

import java.util.*;
public class adv_pttrn1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows:-");
        n=sc.nextInt();
                                                for (int i=0;i<n;i++){
                                                    if(i==n-1 || i==0) {
                                                        for (int j = n; j > 0; j--) {

                                                            System.out.print("* ");
                                                        }
                                                        System.out.print("\n");
                                                    }
                                                    else{
                                                        for (int j=0;j<n;j++){
                                                            if(j==0 || j==n-1){ System.out.print("* ");}
                                                            else
                                                                System.out.print("  ");
                                                        }
                                                        System.out.print("\n");
                                                    }

                                                }System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("New educator's way:-\n");
        holow_rect(n,6);

    }
public static void holow_rect(int row,int col){
        for (int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){System.out.print("* ");}
            else
            System.out.print("  ");}
            System.out.print("\n");
        }
}


}

