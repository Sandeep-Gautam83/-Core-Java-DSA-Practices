import java.util.Scanner;

public class BasicArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int[] arr = new int[7];
        for(int i=0; i<=6; i++){
            arr[i]= sc.nextInt();
        }
        //output print
        for (int i=0; i<=6; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
