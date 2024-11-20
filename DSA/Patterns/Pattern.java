
public class Pattern {
    public static void pat1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=n-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pat3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pat4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print("*");    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void pat5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j>=n-i && j<=n+i){
                    System.out.print("*");    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pat6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(j>=i && j<=2*n-2-i){
                    System.out.print("*");    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pat7(int n){
        for(int i=0;i<n;i++){
            boolean k=true;
            for(int j=0;j<2*n;j++){
                if(j>=n-i-1 &&j<n+i && k){
                    System.out.print("*");
                    k=false;
                }
                else{
                    System.out.print(" ");
                    k=true;
                }
                
            }
            System.out.println();
        }
    }
    public static void pat8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j<n-i || j>=n+i){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
    public static void pat9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j<=i || j>=2*n-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                    
                }
            }
            System.out.println();
        }
    }
    public static void pat10(int n){
        for(int i=0;i<n;i++){
            int k=1;
            for(int j=0;j<2*n;j++){
                if(j>=n-i-1 && j<n+i){
                    System.out.print(k);
                    if(j<n-1) k++;
                    else k--;
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    public static void pat11(int n){
        for(int i=0;i<2*n;i++){
            for(int j=0;j<2*n;j++){
                if((j>=n-i-1 && j<n+i && i<n) ||(i>=n && j>=i-n+1 && j<2*n-i+n-2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
    public static void pat12(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<n;j++){
                if((i<n && j<=i) || (i>=n && j<=2*n-i-2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        pat12(6);
    }
}
