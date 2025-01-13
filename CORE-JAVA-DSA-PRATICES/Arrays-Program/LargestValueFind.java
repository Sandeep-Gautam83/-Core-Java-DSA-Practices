//public class LargestValueFind {
//
//    public static int getlargest(int number[]) {
//        int largest = Integer.MIN_VALUE;
//
//        for (int i = 0; i < number.length; i++) {
//            if (largest < number[i]) {
//                largest = number[i];
//            }
//
//        }
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        int number[] = {6, 4, 5, 9, 4, 3, 2, 3, 2, 1, 3};
//        System.out.println("largest number is : " + getlargest(number));
//
//    }
//}


public class LargestValueFind {
    public static int getsmallest(int number[]) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[] = {10, 20, 40, 50, 16, 17, 15, 18, 16, 18, 15, 15, 17, 15, 17, 19, 16, 15};
        System.out.println("Smallest number is : " + getsmallest(number));
    }
}

//time complexicity O(n)