import java.util.Arrays;
import java.util.HashSet;

public class BasicOne {
    /*
    Brute
     */
    public static int LargestElement(int []arr,int n){
        Arrays.sort(arr);//NLOG(N)
        return arr[n-1];
    }

    ////////////////////////////
    public static int SecondLargest(int arr[],int n){
        //O(NLOGN)
        Arrays.sort(arr);
        int SecondMax=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=SecondMax){
                SecondMax=arr[i];
                break;
            }
        }
        return SecondMax;
    }
    public static int[] RemoveDuplicate(int arr[],int n){
        // // ^| O(nlogn +n)
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr){//O(N) Iterate
            hs.add(i);//insert NLOGN
        }
       
        int k=0;
        for(int i:hs){//O(N)
            arr[k++]=i;
        }
        return Arrays.copyOfRange(arr,0,3);
    }

    /////BETTER
    public static int BetterSecondLargest(int []arr,int n){
        //find max in first iteration=> O(2n)
        int Max=0,secondLargest=-1;
        for(int i=0;i<n;i++){
            Max=Math.max(Max,arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=Max) secondLargest=arr[i];
        }
        return secondLargest;
    }


// ---------------------------------------------------------------------------------------------------------------------------
    /*
    OPTIMALS
     */
    public static int OptimalLargestElement(int []arr,int n){
        int max=arr[0];//O(N)
        for(int i=1;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    /////////////////////////////////
    public static int OptimalSecondLargest(int arr[],int n){
        int Max=arr[n-1];
        int secondMax=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>Max){
                secondMax=Max;
                Max=arr[i];
            }else if(secondMax<arr[i]){
                secondMax=arr[i];
            }
        }
        return secondMax;

    }
    ///////////////////////////////////////
    public static int[] OptimalRemoveDuplicate(int arr[],int n){
        //two pointer
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return arr;
    }

    public static void main(String []args){
        
    }
}