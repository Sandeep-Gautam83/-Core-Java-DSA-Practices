public class SecondMaxArray {
    public static void main(String[] args) {
        int arr[] = {23, 4, 53, 6, 63, 5, 54, 55, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int secmax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                secmax = Math.max(secmax,arr[i]);
            }
        }
        System.out.println(secmax);
    }
}