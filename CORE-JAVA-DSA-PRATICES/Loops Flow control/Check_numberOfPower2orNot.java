public class Check_numberOfPower2orNot {
    public static boolean printst(int n){
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(printst(8));
    }
}
