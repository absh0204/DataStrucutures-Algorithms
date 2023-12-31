import java.util.*;
public class incometaxcalc {
    public static void main(String args[]){
        double sal, tax , income;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income:-");
        income = sc.nextFloat();
        if (income < 500000) {
            tax = 0 * income;
            sal = income - tax;
            System.out.print("Tax you have to pay:-" + tax+"\n");
            System.out.print("Salary after tax payment:-" + sal);
        } else if (income >= 500000 && income < 1000000) {
            tax = 0.2 * income;
            sal = income - tax;
            System.out.print("Tax you have to pay:-" + tax+"\n");
            System.out.print("Salary after tax payment:-" + sal);
        } else if (income > 100000) {
            tax = 0.3 * income;
            sal = income - tax;
            System.out.print("Tax you have to pay:-" + tax+"\n");
            System.out.print("Salary after tax payment:-" + sal);
        }
    }
}