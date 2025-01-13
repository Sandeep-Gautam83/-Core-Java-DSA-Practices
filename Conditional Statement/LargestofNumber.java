import java.util.Scanner;

public class LargestofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Enter the  first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number  : ");
        int b = sc.nextInt();

        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if (b>=a && b>=c ){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
