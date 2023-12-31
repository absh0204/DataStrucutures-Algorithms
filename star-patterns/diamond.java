import java.util.*;
public class diamond {
    public static void dmond(int n){
        //METHOD 1:===========================================================================================
        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=n;i>0;i--){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //METHOD 2:=============================================================================================
        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<(2*n+1)-(2*i);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        System.out.print("Diamond pattern:\n");
        int n=5;
        Scanner scs=new Scanner(System.in);
        System.out.print("Enter number of row for half only:\n");
        //n=scs.nextInt();
        dmond(n);

    }
}
