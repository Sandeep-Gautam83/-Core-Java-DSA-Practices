import java.util.Scanner;

public class markcountIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int arr[]={81,45,76,100,12,34,56,34};
        for (int i=0; i<arr.length; i++){
            if (arr[i] < 35){
                System.out.print(i+" ");
            }
        }
    }
}
