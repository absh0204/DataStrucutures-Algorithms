public class BasicThree {

    // BRUTE
    public static void BruteMissing(int arr[]){
        // start from element=1
        // search till n-1 if exists or not
    }

    public static void BetterMissing(int arr[]){
        // create visited array of size n-1
        //iterate mark element as visited
        //iterate visited array first non visited index is answer
    }

    // OPTIMAL
    public static void OpMissing(int arr[]){
        // Store the element on their respective index as array contain [1...n] so the
        // answer will be index which donot match with element 
        // Index is the answer
        
    }
    public static int SumMissing(int arr[],int n){

        int sum=n*(n-1)/2;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=arr[i];

        }
        int missing=sum2-sum;
        return missing;
    }
    public static int XorMisssing(int arr[],int n){
        //sum contains all number
        //the number in array xor and make its part zero in the sum
        // in the end if sum 0 return n else remaining
        /* O(N)
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
            xor1=xor1^i;
        }
        for(int i=0;i<n-1;i++){
            xor2=xor2^arr[i];
        }
        return xor1^xor2;
        xor1=1.2.3.4.5
        xor2=1.2.4.5
        return 4;
        */
        int xor2=0;
        int xor1=0;
        for(int i=0;i<n;i++){
            xor2=xor2^arr[i];
            xor1=xor1^(i+1);
        }
        xor1=xor1^n;
        return xor1^xor2;
        
}
//==========----------------------------------===============
    public static int ConsecutiveOnes(int arr[]){
        int res=0;
        int count=0;
        for(int i:arr){
            if(i==0){
                count++;
                res=Math.max(count,res);
            }
            else{
                count=0;
            }
        }
        return res;
    }

    public static void main(String args[]){

    }
}
