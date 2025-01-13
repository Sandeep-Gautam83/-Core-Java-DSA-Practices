package Bit_Manipulation;

public class OddorEven {
    public static void printoddoreven(int n){
        int bitmask = 1;
        if ((n & bitmask )==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
     printoddoreven(2);
     printoddoreven(3);
    }
}
