import java.util.Scanner;

public class Declar2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions of the 2D array (rows and columns): ");
        int n = sc.nextInt(); // Number of rows
        int m = sc.nextInt(); // Number of columns

        int[][] max = new int[n][m]; // Correctly declare a 2D array

        System.out.println("Enter the elements of the 2D array: ");
        // Input for the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the 2D array are: ");
        // Output the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(max[i][j] + " "); // Print all elements in the same row on one line
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close(); // Close the scanner
    }
}
