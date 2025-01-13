package Object_Oriented_Programming_OOPs;

public class BasicOOPs {
    // Main function
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object
        p1.setColor("Blue");
        System.out.println("Pen color: " + p1.color);
        p1.setTip(5);
        System.out.println("Pen tip: " + p1.tip);
        p1.color = "Yellow";
        System.out.println("Updated pen color: " + p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "sandeep";
        myAcc.setPassword("abcdef");
        // Password is private, so we cannot print it directly
    }
}

class BankAccount {
    public String username;
    private String password;

    // Setter for password
    public void setPassword(String pwd) {
        password = pwd;
    }

    // Getter for password (optional, for demonstration)
    public String getPassword() {
        return password;
    }
}

class Pen {
    String color;
    int tip;

    // Function to set the color of the pen
    void setColor(String newColor) {
        color = newColor;
    }

    // Function to set the tip size of the pen
    void setTip(int newTip) {
        tip = newTip;
    }
}

class student {
    String name;
    int age;
    float percentage;

    // Function to calculate percentage
    void calcPercentage(int phy, int che, int math) {
        percentage = (phy + che + math) / 3.0f; // Ensure floating-point division
    }
}

/*
Objects = Entities in the real world
Examples: pen, animal, watch
Heap memory is used for objects.

Classes = Group of these entities (Blueprint)
Examples: attributes and behaviors

Getters and Setters:
- Get: To return the value
- Set: To modify the value

this: Refers to the current object

++++++++++++++++++++++++++++++++++++++++++++++
Access Specifiers 4 type
1.public
2.private
3.proteted
4.Default


+++++++++++++++++++++++++++++++++++++++++++++++++

4 Pilars => OOPs

1.Encapsulation=>Implements data hiding
2.Inheritance
3.Abstraction
4.Polymorphism


1.Encapsulation : Encapsulation is defind as the wrapping up of data & methods under a single unit.
  it also implements data hiding.

Notes :
 ConstructorsOperationFerform : Constructor is a special method which is invoked auomatically
 at the time of object creation.



*/
