package Bit_Manipulation;

public class ClearIBitRange {

    public static int printst(int n, int i, int j){
        int a= ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitmask = a|b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(printst(10,2,4));
    }
}


// n=100111010011, i=2,j=7
//output = 100100000011

