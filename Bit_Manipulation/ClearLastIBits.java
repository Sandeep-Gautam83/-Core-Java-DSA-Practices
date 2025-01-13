package Bit_Manipulation;

public class ClearLastIBits {
    public static int printst(int n, int i){
        int bitmarsk = ~(0) << i;
        return n & bitmarsk;
    }
    public static void main(String[] args) {
        System.out.println(printst(15,2));
    }
}


// n=1111, i=2
// convert it 1100
// 1111 & 1100 =>1100 answer