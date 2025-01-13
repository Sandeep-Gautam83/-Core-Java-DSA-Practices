import java.util.Scanner;

public class MarksCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the marks number : ");
        int marks = sc.nextInt();

        if(marks >=81 && marks<=100){
            System.out.println("very good");
        }else if (marks>=61 && marks<=80){
            System.out.println("good");
        }else if (marks>=41&& marks<=60){
            System.out.println("Average");
        }else {
            System.out.println("fail");
        }
    }
}
