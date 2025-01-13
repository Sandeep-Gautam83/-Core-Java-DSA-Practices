package Bit_Manipulation;

public class SetithBIt {


    public static int printst(int n, int i){
        int bitmask=1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(printst(10,2));
    }
}


//1010 Or 10100 => 14
