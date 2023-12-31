package javabasics.src;

import java.util.Scanner;
public class average {
    public static void main(String args[]){
        /*int a,b,c;
        System.out.print("Enter the three numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Average of numbers:-");
        System.out.print((a+b+c)/3);
        */
        int a,b,c,d;
        double pe,er,pen,gst1,gst2,gst3;
        System.out.print("Enter side of square:- ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("area:-");
        System.out.println(a*a);
        System.out.print("Enter the cost of pencil,pen and eraser respectively:- ");
        b= sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        pe=  ((0.18*b)+b);
        gst1=(0.18*b);
        er=  ((0.18*d)+d);
        gst2=(0.18*d);
        pen=  ((0.18*c)+c);
        gst3=(0.18*c);
        System.out.print("Total GST:-");
        System.out.println(gst2+gst1+gst3);
        System.out.print("Total Bill of Purchase:-");
        System.out.println(pe+er+pen);




    }
}
