//import java.util.Scanner;
//
//public class LoopControlProgramAll {
//    public static void main(String[] args) {
//        System.out.println("Enter the number : ");
//        int counter=0;
//        while (counter < 100) {
//            System.out.println("Hello world");
//            counter++;
//        }
//    }
//}

//
//import java.util.Scanner;
//
//public class LoopControlProgramAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n=sc.nextInt();
//        int i=1;
//        while (i<=n){
//            System.out.println(+i);
//            i++;
//        }
//    }
//}

//
//import java.util.Scanner;
//
//public  class LoopControlProgramAll {
//    public static void main(String[] args) {
//        System.out.println("Enter the number : ");
//        Scanner sc = new Scanner(System.in);
//        int i=1;
//        int sum=0;
//        int n=sc.nextInt();
//        while (i <= n) {
//               sum =sum + i;
//               i++;
//            System.out.println(sum);
//        }
//    }
//}

//
//import java.util.Scanner;
//
//public class LoopControlProgramAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        for (int i = 0; i <= n; i++) {
//            System.out.println(+i);
//        }
//    }
//}

//import java.util.Scanner;
//
//public class LoopControlProgramAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


import java.util.Scanner;

public class LoopControlProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println();
    }
}