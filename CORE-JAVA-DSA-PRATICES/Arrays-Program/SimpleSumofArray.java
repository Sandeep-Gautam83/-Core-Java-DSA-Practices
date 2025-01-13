import java.util.Scanner;

public class SimpleSumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int sum = 0;
        int n = sc.nextInt(); // Read the size of the array
        int arr[] = new int[n]; // Declare and initialize the array

        for (int i = 0; i < n; i++) { // Iterate up to 'n' instead of 'n-1'
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum); // Print the sum
    }
}
