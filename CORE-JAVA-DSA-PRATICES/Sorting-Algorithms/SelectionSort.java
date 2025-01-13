public class SelectionSort {
    public static void selectionsort(int number[]) {
        for (int i = 0; i < number.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < number.length; j++) {
                // यदि ascending order चाहिए तो शर्त बदलें:
                if (number[minPos] > number[j]) { // Ascending order
                    minPos = j;
                }
            }
            // Swap
            int temp = number[minPos];
            number[minPos] = number[i];
            number[i] = temp;
        }
    }

    public static void printstatement(int number[]) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " "); // number[i] सही है
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {32, 4, 5, 645, 35, 344, 56, 3, 4, 644, 543};
        System.out.println("Before sorting:");
        printstatement(number); // Sorting से पहले प्रिंट करें
        selectionsort(number);
        System.out.println("After sorting:");
        printstatement(number); // Sorting के बाद प्रिंट करें
    }
}


//time complexcity O(n2)
