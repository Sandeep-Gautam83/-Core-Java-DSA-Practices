public class InsertionSort {

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // शर्त सही की गई है
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr; // सही स्थान पर current value रखें
        }
    }

    public static void printStatement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // एक ही लाइन में प्रिंट करें
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {12, 34, 56, 7, 8, 6, 8, 9, 767, 6, 5, 6};
        System.out.println("Before sorting:");
        printStatement(number); // Sorting से पहले प्रिंट करें
        insertionsort(number);
        System.out.println("After sorting:");
        printStatement(number); // Sorting के बाद प्रिंट करें
    }
}
