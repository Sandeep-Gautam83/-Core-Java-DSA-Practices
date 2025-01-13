package String;

/*
Declare
MyStringBuilder sb = new MyStringBuilder("HelloWorld")

string me change ko  (object ho <-condition)
sb.toString()

example
Integer a =10;
a.toString()

Character ch = 'a';
ch.toString()

sb.append();    => String ke piche add karne ke liye

  Character.toUpperCase(ch)
  Character.toLowerCase(ch)

 */
import java.util.*;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); // Using the built-in StringBuilder class
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}

//O(26)