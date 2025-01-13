import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
//        int number[] = {12, 3, 4, 34, 5, 5435, 4, 5, 4, 45, 444, 4, 333, 4};

        Integer number[] = {12, 3, 4, 34, 5, 5435, 4, 5, 4, 45, 444, 4, 333, 4};

        // Array को sort करें
//        Arrays.sort(number);
        // Sorted array को प्रिंट करें
//        System.out.println("Sorted Array: " + Arrays.toString(number));

        //inbuilt sort
        //Arrays.sort(arr, start,end)
//        Arrays.sort(number,0,5);
//        System.out.println("Sorted Array : "+Arrays.toString(number));

// sort arrays ko reverse kar deta hai
        Arrays.sort(number, Collections.reverseOrder());
        System.out.println(Arrays.toString(number));

    }
}
