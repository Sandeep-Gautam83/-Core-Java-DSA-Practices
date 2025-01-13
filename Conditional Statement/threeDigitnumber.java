import java.util.Scanner;

public class threeDigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n =sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("This is three digit number");
        }else{
            System.out.println("Not a three digit number");
        }
    }
}
