import java.util.*;
public class B_prac {
    public static void main(String args[]){
        int b=4;
        for(int k=b;k>=1;k--){
            int flag=0;
            for (int j=0;j<2*b;j++){
                if (k==b || j<k){
                    System.out.print("*");
                }
                else if(j>((k-1)+(2*flag)))
                    System.out.print("*");

                else if(j<=((k-1)+(2*flag))){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            flag++;
        }
    }
}
