import java.util.ArrayList;
import java.util.List;

public class BasicTwo {
    /*
    BRUTE

     */
    public static void LeftRotateByDplaces(int arr[],int n,int d){
        int temp[]=new int[d];
        d=d%n;
        // arr[]={1,2,3,4,5,6,7}=d=2={3,4,5,6,7,1,2}
        for(int i=0;i<d;i++){//O(d)
            temp[i]=arr[i];
        }
        
        //or temp[]=Arrays.copyOfRange(0,d);
        //temp= [1,2]
        for(int i=d;i<n;i++){//O(n-d)
            arr[i-d]=arr[i];
        }
        // arr=[3,4,5,6,7,6,7] k=5,n=6
        
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        // arr[]=[3,4,5,6,7,1,2] answer
    }
    public static void ZerotoEnd(int arr[],int n){
        //iterate and store all non zero and store in list
        //copy all the number from list to array
        //put the remainig positions to zero
    }
    public static void JoinTwoSorted(int arr[],int arr2,int n1,int n2){
        //throw arr1,arr2 elements after comparing in sets(Linked HashSet)
        //copy in new array[size(set)] return 


    }
    public static void intersection(int []arr1,int []arr2,int vis[]){
        //ask if arr1 elements in the arr2 if existed vis[arr2 index] =true
        //store intersection and return
    }


    /*
    OPTIMAL

     */
    public static void LeftRotate(int arr[],int n){
        // left rotation means element from left go to end 

        //1 POSITION LEFT ROTATE 
        int tmp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=tmp;

    }
    public static void reverse(int arr[],int si,int ei){
        while (si<ei) {
            int temp=arr[ei];
            arr[ei]=arr[si];
            arr[si++]=temp;
            ei--;
        }
    }
    public static void OptimalLeftRotateByDplaces(int arr[],int n,int d){
        //REVERSE FIRST D ELEMENTS THEN REVERSE LAST N-D ELEMENTS
        //REVERSE WHOLE ARRAY AFTER 1ST STEP O(2N)
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

    }
    //////////////////////
    public static void OptimalZerotoEnd(int arr[],int n){
        //
        int i=0;
        while(i<n){
            if(arr[i]==0) break;
            i++;
        }
        int j=i+1;
        while (j<n) {
            if(arr[j]!=0){
                arr[i]=arr[j];
                arr[j]=0;
            }
            i+=1;
            j+=1;
        }
        
        
    }

    ///////////////
    public static void OptimalJoinTwoSorted(int arr[],int []arr2,int n1,int n2){
        ArrayList<Integer>res=new ArrayList<>();
        int i=0,j=0;
        int k=-1;
        while (i<n1 && j<n2) {
            if(arr[i]<=arr2[j]){
                if(k==-1 ||arr[i]!=res.get(k)){
                    res.add(arr[i]);
                    k++;
                }
                i+=1;
            }else{ 
                if(k==-1 ||arr2[j]!=res.get(k)){
                    res.add(arr2[j]);
                    k++;
                }
                j+=1;
            }
        }
        while (i<n1){
            if(res.get(k)!=arr[i]){
                res.add(arr[i]);
                k++;
            }
            i+=1;
        }
        while (j<n2){
            if(res.get(k)!=arr[i]){
                res.add(arr2[j]);
                k++;
            }
            j+=1;
        }
    }
    public static List<Integer> intersection(int []arr,int[]arr2){
        List<Integer>res=new ArrayList<>();
        //two pointer
        //match store move both pointer
        //else move smaller element pointer continues till smallest array length
        return res;
    }
    
    public static void main(String []args){
        
    }
}
