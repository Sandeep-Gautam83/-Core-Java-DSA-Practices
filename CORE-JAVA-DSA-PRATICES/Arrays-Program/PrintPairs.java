public class PrintPairs {

    public static void pairprint(int number[]) {
        int tol = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i]; // 2,4,6,8,10
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tol++;
            }
            System.out.println();
        }
        System.out.println("total pair array is : " + tol);
    }


    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        pairprint(number);
    }
}


//time complexcity = O(n2)