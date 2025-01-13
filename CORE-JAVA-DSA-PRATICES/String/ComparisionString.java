package String;

public class ComparisionString {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABCs";

        if (s1.equals(s2)) {
            System.out.println("String equals");
        } else {
            System.out.println("String are not equals");
        }
    }
}
