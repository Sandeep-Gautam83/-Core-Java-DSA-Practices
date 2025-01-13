package Bit_Manipulation;

public class LeftshifOperator {

    public static int printlef(int n, int i){
        int bitmask = 1;
        if((n & bitmask)==0){
            return 0;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(printlef(10,2));
    }
}
