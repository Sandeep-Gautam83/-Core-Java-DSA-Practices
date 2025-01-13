//public class PrintSubarrays {
//
//    public static void printsubarr(int number[]) {
//        int tol = 0;
//        for (int i = 0; i < number.length; i++) {
//            for (int j = i; j < number.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(number[k] + " ");
//                }
//                tol++;
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println("tolal subarray number is : " + tol);
//
//    }
//
//    public static void main(String[] args) {
//        int number[] = {2, 4, 6, 8, 10};
//        printsubarr(number);
//    }
//}
//
//

public class PrintSubarrays {
    public static void subarraySum(int number[]) {
        int totalSum = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    // totalSum += number[k];
                    totalSum = totalSum + number[k];
                }
            }
        }

        System.out.println("Total sum of all subarrays : " + totalSum);
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        subarraySum(number);
    }
}
