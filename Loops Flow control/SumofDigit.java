import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n =sc.nextInt();
        int sum =0;
        while (n!= 0){
            int lastdigit = n%10;
            sum = sum +lastdigit;
            n=n/10;
        }
        System.out.println("Total sum is :"+sum);
    }
}
