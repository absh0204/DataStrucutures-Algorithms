import java.util.*;
public class rhmbuspttern {
    public static void rhombus(int n){
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--){
                System.out.print("   ");
            }
            for (int k=0;k<n;k++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
    public static  void main(String args[]){
        Scanner leo=new Scanner(System.in);
        System.out.print("'*' REPRESENTS THE 1 UNIT\n\n\nEnter side length of a Rhombus:-");
        int a=leo.nextInt();
        rhombus(a);
    }
}
