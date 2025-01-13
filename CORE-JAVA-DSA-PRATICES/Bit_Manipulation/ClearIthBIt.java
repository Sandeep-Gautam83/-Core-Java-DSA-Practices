package Bit_Manipulation;

public class ClearIthBIt {
    public static int printst(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(printst(10,1));
    }
}


// 1010 AND 1101 => 1000(8) OUTPUT