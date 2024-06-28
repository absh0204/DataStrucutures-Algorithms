package javabasics.Second_src.Bit_manipulation;

public class A_one {
    public static void main(String args[]){
        /// rules:
        /*
        * the left shift operater is <<, usecase: (num)13<<k here it means (num)13*2 power k
        * the right shift operator is >>, use case: 13<<k here it means 13/(2 power k)
        * the negative number is stored in the form of 2's complement
        *                         NOT of negative
        * step 1: calculate 2's complement if number is negative
        * step 2:        FLIP
        * step 3:           CHECK IF -VE
        *                 yes  /   \no
        *                    /        \
        *          find 2's comp      stop
        *                 |             |
        *                 store.        store.
        *
        *
        *XOR : Even no 1's:0 and odd no. of ones:1 (Behaviour for different values)
        *
        * swap number using bit map: a=a^b^a b=a^b^b
        * so
        *
        * check ith bit set or not:
        *       left shift operator
        *             for 13 use left shift on 1 so 1  becomes for i=2 is 100
        *               now 13 & (100) bin
        *                   /           \
        *              non-zero          0
        *                   set         not set
        *
        *       right shift operator
        *               1101>>i(for ex 2)=0011
        *                  0011 & 1
        *                     /   \
        *                     1
        *                      |
        *
        *
        *TO set bit left shift 1 by position and or it with the number
        *
        *                                       CLEARING ith BIT
        *           1<<(left shift by ) i then complemnt it and then & it with number
        *
        *
        *                                       Toggling ith bit
        *                       XOR of the number with 1<< (left shift by ith times).
        *
        *                                       Remove last set Bit
        *                      return (number-1 and op number) n-90 so removing last set bit gives answer 90&89
        *
        *
        *                             if number is power of two= (n*(n-1))==0
        *


        SWAP TWO NUMBERS:(Property Xor with same number gives value 0)
        A=(A^B)
        B=(A^B) MEANS (A^B)^B= A [HERE A=A^B AND B=B]
        NOW:
        A=A^B MEANS(A=A^B XOR with A gives B)

        * */
    }
}

////////////////////////////////////////

