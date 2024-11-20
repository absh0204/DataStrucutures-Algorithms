import java.util.HashMap;

public class LongestSubarraySum {

    // brute 
    // generate all subarrays using two loops n^2 and compare sum==k count++;\\

    //better{HASHING}
    //prefix sum
    public static int subarraySum(int arr[],int n,int k){
        //OPTIMAL IF ARRAY HAS BOTH POSITIVE AND NEGATIVES
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        int len=0;
        for(int i=0;i<n;i++){
            if(sum==k){
                len=Math.max(len,i+1);
            }
            if(hm.containsKey(sum-k)){
                int idx=hm.get(sum-k);
                len=Math.max(len,i-idx);
            }
            if(!hm.containsKey(sum))hm.put(sum,i);
        }
        return len;

    }
    //OPTIMAL FOR NOT CONTAINING NEGATIVES
    public static int OptimalsubarraySum(int arr[],int n,int k){
        //two pointer greedy approach
        int len=0;
        int sum=0;
        int i=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            
            while(sum>k && i<=j &&i<n){
                sum-=arr[i];
                i+=1;
            }
            if(sum==k){
                len=Math.max(len,j-i);
            }
        }



        return len;

    }
    public static void main(String []args){
         
    }
}
