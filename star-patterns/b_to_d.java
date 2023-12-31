package javabasics.src;

import java.util.*;
public class b_to_d {
    public static void main(String args[]) {
        int b, d1,d2, dec = 0, bin1 = 0, pow1 = 0, pow2 = 0;
        int n, m1, m2,count=0;
        Scanner sc = new Scanner(System.in);


//
//        System.out.print("Binary to Decimal\nEnter the binary number:-");
//        b = sc.nextInt();
//        while (b > 0) {
//            n = b % 10;
//            dec = (int) (dec + (n * Math.pow(2, pow1)));
//            pow1++;
//            b = b / 10;
//        }
//        System.out.println("Decimal number:-" + dec);
//
        //////////////////////////////////////


        System.out.print("Decimal to Binary\nEnter the Decimal number's \nWhole number part:-");
        d1 = sc.nextInt();
        System.out.print("Floating part:-");
        d2 = sc.nextInt();
        while (d1 >1) {
            m1 = d1 % 2;
            bin1 = (bin1+ (m1*(int)Math.pow(10,pow2)));
            pow2++;
            d1=d1/2;
        }
        int bin2=0,ext=0,pow4=0;

        count=d2;

        do{
            int pow3=1;
            ext=d2*2;
            System.out.println(d2+"  " +ext);

            while( ext>1){
                ext=ext/(int)(Math.pow(10,pow3));
                pow3++;
            }

            if((d2*2)>(int)(Math.pow(10,pow3))){
            d2=(d2*2)-(int)(Math.pow(10,pow3));
            }
            else if((d2*2)<(int)(Math.pow(10,pow3))){
                d2=(int)(Math.pow(10,pow3))-(d2*2);
            }
            pow3=1;
            bin2=bin2+(ext*(int)(Math.pow(10,pow4)));
            pow4++;
            System.out.println(d2+"  "+ext);
            ext=0;


        }while(d2!=0);

        System.out.print("Binary number:-"+bin1+"."+bin2);
        System.out.print(d2+"\n");
    }
}
