//import java.util.Scanner;
//
//public class JavaConditionalProgramAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the age : ");
//        int age = sc.nextInt();
//        if (age >= 18) {
//            System.out.println("adult : drive, vote ");
//        } else {
//            System.out.println("not adult");
//        }
//    }
//}

//
//import java.util.Scanner;
//
//public class JavaConditionalProgramAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter the number b : ");
//        int b = sc.nextInt();
//        if (a >= b) {
//            System.out.println("a is largest of 2");
//        } else {
//            System.out.println("b is largest of 2");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class JavaConditionalProgramAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number is :");
//        int n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//    }
//}


/*
import java.util.Scanner;

public class JavaConditionalProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 13 && age <= 18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }
    }
}

 */


/*
import java.util.Scanner;

public class JavaConditionalProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rupay is : ");
        int incomeTax = sc.nextInt();
        if (incomeTax <= 500000) {
            System.out.println("tax is 0 % ");
        } else if (incomeTax >= 500000 && incomeTax <= 1000000) {
            System.out.println("tax is 20 %");
        } else {
            System.out.println("tax is 30 %");
        }
    }
}


 */


/*
import java.util.Scanner;

public class JavaConditionalProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income is :");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("your tax is : " + tax);
    }
}

 */


/*
import java.util.Scanner;

public class JavaConditionalProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A is :");
        int A = sc.nextInt();
        System.out.println("Enter the number B is :");
        int B = sc.nextInt();
        System.out.println("Enter the number C is :");
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)) {
            System.out.println("A is largest ");
        } else if (B >= C) {
            System.out.println("B is largest ");
        } else {
            System.out.println("C is largest ");
        }
    }
}

 */


// Ternary Operator

//import java.util.Scanner;
//
//public class JavaConditionalProgramAll {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number a is :");
//        int a = sc.nextInt();
//        System.out.println("Enter the number b is :");
//        int b = sc.nextInt();
//        int larger = (a > b) ? a : b;
//        System.out.println("larger value is : " + larger);
//        System.out.println("Enter the n value is ");
//        int n = sc.nextInt();
//        String type = (n % 2 == 0) ? "Even" : "Odd";
//        System.out.println(type);
//    }
//}

/*
import java.util.Scanner;

public class JavaConditionalProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks is : ");
        int marks = sc.nextInt();
        String type = marks >= 33 ? "Pass" : "Fail";
        System.out.println(type);
    }
}

 */


//Switch statement

/*
import java.util.Scanner;

public class JavaConditionalProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thruesday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("Satarday");
                break;

            default:
                System.out.println("Invalid enter the number ");

        }
    }
}

 */

// Qus create calculator

import java.util.Scanner;

public class JavaConditionalProgramAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a is :");
        int a = sc.nextInt();
        System.out.println("Enter the number b is :");
        int b = sc.nextInt();
        System.out.println("Enter the Operator is :");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("addition is : " + (a + b));
                break;
            case '-':
                System.out.println("subtrart is : " + (a - b));
                break;
            case '*':
                System.out.println("multiply is : " + (a * b));
                break;
            case '/':
                System.out.println("divide is : " + (a / b));
                break;
            case '%':
                System.out.println("modulo is : " + (a % b));
                break;
            default:
                System.out.println("Invalid number entered");

        }
    }
}



