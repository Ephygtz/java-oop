import javax.swing.*;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner pascal = new Scanner(System.in);
//        System.out.println("Kindly enter your name?");
        String name = JOptionPane.showInputDialog("Kindly enter your name?");
//        System.out.println("Where do you reside?");
        String location = JOptionPane.showInputDialog("Where do you reside?");
//        System.out.println("Enter your phone number?");
//        int phoneNo = pascal.nextInt();
        JOptionPane.showMessageDialog(null, "Hi there " + name + "You reside in " +location);
//        System.out.println("Hi there " + name + ". Your phone no is " + phoneNo + " and you live in " + location);
    }
}
