public class sortZero_one_Two {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //BETTTER
    /*
     * COUNT ZERO,ONE TWO THEN THREE LOOPS TWO PLACE ALL THE ELEMENTS
     * 
     */
    //OPTIMAL

    // DUTCH NATIONAL FLAG ALGORITHM
    /*  visualization:
    // [0...low-1,low.....mid-1,mid.....high,high+1......n-1]
    // put low at 0th index and mid at 0th index and high at last index
    // hypothetically think that the 0 to low-1 all zeroes occurs int array and low to mid-1 all ones
    mid-1 to high all non sorted part to be sorted and high to infinity all the 2's occuring
    [00...11...(non-sorted)...22]


    */
    public static void fn(int []arr,int n){
        //O(N) TIME COMPLEXITY
        int low=0;
        int mid=0;
        int high =n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid+=1;
                low+=1;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }

    }

    public static void main(String []args){

    }
}
