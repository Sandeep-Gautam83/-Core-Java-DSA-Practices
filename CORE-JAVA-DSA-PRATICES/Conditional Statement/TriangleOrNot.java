import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting the user for input
        System.out.println("Enter the first side of the triangle: ");
        int a = sc.nextInt();

        System.out.println("Enter the second side of the triangle: ");
        int b = sc.nextInt();

        System.out.println("Enter the third side of the triangle: ");
        int c = sc.nextInt();

        // Checking the triangle condition
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("This is a triangle.");
        } else {
            System.out.println("Not a triangle.");
        }

        sc.close(); // Closing the scanner to prevent resource leaks
    }
}
