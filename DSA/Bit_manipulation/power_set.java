public class power_set {
    public static void main(String arg[]){
        ////Approach [0-> you consider that element in subset]
        /////        [1-> you will  consider the element in subset]


        //indexes:[ 1   2   3]
        // binary| 0    0   0->[] -----------------|
        /////////| 0    0   1->[3]                 |
        /////////| 0    1   0->[2]                 |_
        /////////| 0    1   1->[2,3]                 |
        /////////| 1    0   0->[1]                    [8 number of subsets]  
        /////////| 1    0   1->[1,3]                _|
        /////////| 1    1   0->[1,2]               |
        /////////| 1    1   1->[1,2,3]-------------|


        //XOR OF NUMBERS IN RANGE
        // to find xor of numbers falling in the range following you should do:
        /* 
         * n=1 1=1
         * n=2 1^2=3
         * n=3 1^2^3=0
         * n=4 1^2^3^4=4                        
         *                                  conclusion is (n%4=1 ans =1)
         *                                  conclusion is (n%4=2 ans =n+1)
         *                                  conclusion is (n%4=3 ans =0)
         *                                  conclusion is (n%4=0 ans =n)
         * 
         * n=5 1^2^3^4^5=1
         * n=6 1^2^3^4^5^6=7
         * n=7 1^2^3^4^5^6^7=0
         * n=8 1^2^3^4^5^6^7^8=8
         * 
         * 
         *                      TO FIND (L-R) XOR=> find :(xor till(L-1)) and xor it with (xor till(range(R)))
         * 
            // TO GET THE RIGHT MOST SET BIT =(num&(num-1))^(num)

        */
        

            
    }
    
}
