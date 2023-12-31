import java.util.*;
public class leapyear {
    public static void main(String args[]){
//        int year;
            Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Year:-");
//        year=sc.nextInt();
//        if (year%4==0||year%400==0)
//            {
//                System.out.print(year+" IS LEAP YEAR.");
//            }
//        else if (year%100==0){
//            System.out.print(year+ " is not a Leap Year.");
//        }
//        else
//            System.out.print(year+ " is not a Leap Year.");

        // PROGRAM FOR PRIME NUMBER
        int num;
        int flag=0;
        System.out.print("Enter the number:- ");
        num = sc.nextInt();
        for (int i=2;i<=num;i++){
            if(num%i==0) {
                flag++;
            }
        }
        if (flag<=1 && flag!=0){
            System.out.print(num+" is Prime number.");

        }
        else
            System.out.print(num+" is not a Prime number.");

    }
}
