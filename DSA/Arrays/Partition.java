import java.util.*;
public class Partition {
    // brute force
    // fix i then start j=i+1 till n-1 
    // check if(sum(0..i)==sum(i+1...j)==sum(j...n)) then return true
    // time complexity = (O(n3))

    public static List<Integer> partition(int []arr){
        int n =arr.length;
        int count=0;
        List<Integer>res=new ArrayList<>();
        int ans=0;
        for(int i:arr){
            ans+=i;
        }
        int parts=ans/3;
        if(ans%3!=0){
            res.add(-1);res.add(-1);
            return res;
        }
        ans=0;
        int i=0;
        while(i<n){
            ans+=arr[i];
            // System.out.println("1 "+ans);
            if(ans==parts){
                count++;
                break;
            }
            i++;
        }
        int j=i+1;
        ans=0;
        while(j<n){
            ans+=arr[j];
            // System.out.println("2 "+ans);
            if(ans==parts) {
                count++;
                break;
            }
            j++;
            
        }
        
        int k=j+1;
        ans=0;
        while(k<n){
            ans+=arr[k];
            // System.out.println("3 "+ans);
            if(ans==parts) {
                count++;
                break;
            }
            k++;
        }
        if(count!=3) {
            res.add(-1);res.add(-1);
            return res;
        }
        res.add(i);
        res.add(j);
        return res;
        // upgradations:
        // calculate total sum first;
        // calculate ith idx sums
        // then jth
        // then subtract sum till jth to check remaining sum 
    }
    public static void main(String args[]){

    }
    
}
