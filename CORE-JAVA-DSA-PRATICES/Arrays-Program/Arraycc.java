//import java.util.Scanner;
//
//public class Arraycc {
//    public static void main(String[] args) {
//        int arrays[] = new int[50];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        arrays[0] = sc.nextInt();
//        System.out.println("Enter the number : ");
//        arrays[1] = sc.nextInt();
//        System.out.println("Enter the number : ");
//        arrays[2] = sc.nextInt();
//        System.out.println("Enter the number : ");
//        arrays[3] = sc.nextInt();
//        System.out.println("Enter the number : ");
//        arrays[4] = sc.nextInt();
//
//        System.out.println("phy :" + arrays[0]);
//        System.out.println("math :" + arrays[1]);
//        System.out.println("che :" + arrays[2]);
//        System.out.println("art :" + arrays[3]);
//        System.out.println("his :" + arrays[4]);
//
//        int percentage = (arrays[0] + arrays[1] + arrays[2] + arrays[3] + arrays[4]) / 4;
//        System.out.println("percentage : " + percentage   );
//
//        System.out.println(arrays.length);
//    }
//}


public class Arraycc {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {98, 88, 77, 79, 84, 96};
        update(marks);

        //print
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}