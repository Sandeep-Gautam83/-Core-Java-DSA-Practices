import java.util.Scanner;

public class OperatorsProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int A = sc.nextInt();
        System.out.println("Enter the number :");
        int B = sc.nextInt();
        System.out.println("Sum is : " + (A + B));
        System.out.println("subtract is :" + (A - B));
        System.out.println("multiply is :" + (A * B));
        System.out.println("divide is " + (A / B));
        System.out.println("modulo is : " + (A % B));
    }
}
