/// / First Method
//public class MaxSubarraySum {
//
//    public static void maxsubarraySum(int number[]) {
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < number.length; i++) {
//            for (int j = i; j < number.length; j++) {
//                currSum = 0;
//                for (int k = i; k <= j; k++) {
//                    currSum = currSum + number[k];
//                }
//                System.out.println(currSum);
//                if (maxSum < currSum) {
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("max sum number is : " + maxSum);
//    }
//
//    public static void main(String[] args) {
//        int number[] = {1, -2, 6, -1, 3};
//        maxsubarraySum(number);
//    }
//}
//
//

/// /time complexcity O(n3)


/// /Second Method
//
//public class MaxSubarraySum {
//
//    public static void maxsubarraysum(int number[]) {
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int prefix[] = new int[number.length];
//        prefix[0] = number[0];
//        for (int i = 1; i < prefix.length; i++) {
//            prefix[i] = prefix[i - 1] + number[i];
//        }
//
//        for (int i = 0; i < number.length; i++) {
/// /            int start = i;
//            for (int j = i; j < number.length; j++) {
/// /                int end = j;
//                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
//                if (maxSum < currSum) {
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("max sum number is : " + maxSum);
//    }
//
//    public static void main(String[] args) {
//        int number[] = {1, -2, 6, -1, 3};
//        maxsubarraysum(number);
//    }
//}
//

////time complexcity O(n3)


// Third method

public class MaxSubarraySum {

    public static void Kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadanes(number);
    }
}

//Time complexcity O(n)