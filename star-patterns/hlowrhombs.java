import java.util.*;
public class hlowrhombs {
    public static void rhombus(int n){
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<n;k++){
                if(i==0 || i==n-1 || k==0 || k==n-1){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        int a=7;
        rhombus(a);
    }
}
