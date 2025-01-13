import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        for (int i=2; i<=10; i++ ){
            System.out.println(i*n);
        }
    }
}
