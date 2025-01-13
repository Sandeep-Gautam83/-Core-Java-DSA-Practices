import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                System.out.println("Composite number");
            }else{
                System.out.println("Not Composite number");
            }
        }
    }
}

//
//import java.util.Scanner;
//
//public class CompositeNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//
//        if (n <= 1) {
//            System.out.println("Not a composite number (composite numbers are greater than 1).");
//        } else {
//            boolean isComposite = false;
//
//            // Check for divisors from 2 to n-1
//            for (int i = 2; i <= n - 1; i++) {
//                if (n % i == 0) {
//                    isComposite = true; // Found a divisor
//                    break; // Exit loop early since we know it's composite
//                }
//            }
//
//            if (isComposite) {
//                System.out.println(n + " is a composite number.");
//            } else {
//                System.out.println(n + " is not a composite number (it is a prime number).");
//            }
//        }
//
//        sc.close();
//    }
//}
