import java.util.*;
public class zro_onepttern  {
    public static void Zrone_pttern(int n) {
        for (int i = 0; i < n; i++) {
                for(int j=0;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1 ");
                    }
                    else
                        System.out.print("0 ");
                }
                System.out.print("\n");
        }
    }
    public static void main(String args[]){
        int r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        r=sc.nextInt();
        Zrone_pttern(r);

    }
}
