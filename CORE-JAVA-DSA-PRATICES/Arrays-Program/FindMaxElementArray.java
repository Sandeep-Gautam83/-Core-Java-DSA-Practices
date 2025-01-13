public class FindMaxElementArray {
    public static void main(String[] args) {
        int arr[] ={34,5,6,5,6,6655,6,7,8,76,8,};
//        int max  = arr[0];
        int max = Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (int i=1; i<arr.length; i++){

//            if (arr[i] > max){
//                max=arr[i];
//            }
            //or

            max= Math.max(max,arr[i]);
            min =Math.min(max,arr[i]);
        }
        System.out.println(max);
        System.out.println(min);
    }
}
