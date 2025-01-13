package String;

import java.util.Scanner;

public class stringDeclare {

    //index find
    public static void printlatter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

//        //String are Immutable
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name : ");
//        String name = sc.nextLine();
////        System.out.println(name);


        //length
//        System.out.println(name.length());


        //concatention
        String firstname = "Sandeep";
        String lastname = "Gautam";
        String fullname = firstname + " " + lastname;
//        System.out.println(fullname);

        //index
//     System.out.println(fullname.charAt(1));

        printlatter(fullname);

    }
}
