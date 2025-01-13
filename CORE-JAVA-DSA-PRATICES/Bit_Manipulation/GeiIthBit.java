package Bit_Manipulation;

public class GeiIthBit {
    public static int printst(int n,int i){
        int bismask = 1 << i;
        if((n & bismask) == 0){
            return 0;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(printst(10,2));
    }
}


// 10= 1010 : second position => 0 answer

