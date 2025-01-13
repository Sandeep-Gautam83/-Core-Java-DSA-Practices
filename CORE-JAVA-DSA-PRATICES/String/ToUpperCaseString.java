package String; // Rename the package to avoid conflict with the built-in String class

public class ToUpperCaseString {

    public static String printstring(String str) { // Change return type to String
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0)); // Capitalize the first character
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // Append the space
                i++; // Move to the next character after space
                sb.append(Character.toUpperCase(str.charAt(i))); // Capitalize the next character
            } else {
                sb.append(str.charAt(i)); // Append the character as is
            }
        }
        return sb.toString(); // Return the modified string
    }

    public static void main(String[] args) {
        String str = "hi i am sandeep";
        String result = printstring(str); // Capture the returned string
        System.out.println(result); // Print the result
    }
}
