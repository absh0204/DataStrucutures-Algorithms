import java.util.*;

public class Majority_Element_Moore_Voting{
    // majority element occuring for n/k times can have k-1 element in the array

        // APPROACH:
        // FOR N/3 AT MAX TWO ELEMETS CAN BE MAJORITY
        // take two vars: elem 1 and elem2 their respective count= cnt1 and cnt2
                            // rules:
        // 1) if match either 1 respective count increases 
        // 2) if completely different both cnt decreases 
        // 3)if at any different element encounter cnt of any is zero respective element will be updated.

        public static List<Integer>majority_Element(int []arr,int n){
            List<Integer>ans=new ArrayList<>();
            int e1=-1;
            int e2=-1;
            int c1=0;
            int c2=0;
            for(int i=0;i<n;i++){
                if(arr[i]==e1) c1++;
                else if(arr[i]==e2) c2++;
                else if(c1==0){
                    e1=arr[i];
                    c1++;
                }else if(c2==0){
                    e2=arr[i];
                    c2++;
                }
                else{
                    c1--;
                    c2--;
                }
            }
            c1=0;c2=0;
            for(int i=0;i<n;i++){
                if(e1==arr[i]){
                    c1++;
                }if(e2==arr[i]){
                    c2++;
                }
            }
            // System.out.print(e1+" ,"+e2);
            if(c1>n/3) ans.add(e1);
            if(c2>n/3) ans.add(e2);
            return ans;
        }
    public static void main(String []args){
        int arr[]={2,2,3,1,3,2,1,1};
        System.out.print(majority_Element(arr, arr.length));
    }

}