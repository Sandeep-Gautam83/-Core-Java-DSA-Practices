package String;

public class PalindromeString {
    //function
    public static boolean printString(String str){
        for (int i=0; i<str.length()/2; i++){
            int n=str.length();
            if (str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str= "racecar";
        System.out.println(printString(str));
    }
}



//O(n)