import java.util.*;
public class TwoSum {
    //single answer return
    public static int[] Twosum(int []arr,int n,int k){
        int []res=new int[2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int rem=k-arr[i];
            if(hm.containsKey(rem)){
                res[0]=hm.get(rem);
                res[1]=i;
                break;
            }
            hm.put(arr[i],i);
        }
        return res;
    }
    //return all possible cases
    

    ///////////OPTIMAL CASE
    // slightly  better 
    public static int[] twoSum(int arr[],int n,int k){
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum>k){
                j--;
            }else if(sum<k){
                i+=1;
            }
            else return new int[]{i,j};
        }    
        return new int[]{-1,-1};    
    }




    public static void main(String []args){
        int []arr={2,6,5,8,11};
        int []res=Twosum(arr,arr.length,14);
        System.out.print(res[0]+","+res[1]);
    }
}
