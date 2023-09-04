package corejava.controlstmts;
import java.util.Scanner;
public class Elseif1 {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        System.out.println("enter pet animals");
        String a=ans.next();
        String a1=ans.next();
        if (a.equalsIgnoreCase("dog")){
            System.out.println("dog is the pet animal");
        }
        else if (a.equalsIgnoreCase("cat")) {
            System.out.println("cat is the pet animal");
        }
        else if ((a.equalsIgnoreCase("cat"))&&(a1.equalsIgnoreCase("dog"))) {
            System.out.println("both cat and dog are pet animals");
        }
        else if (a1.equalsIgnoreCase("cat")) {
            System.out.println("cat is a pet animal");
        }
        else if (a1.equalsIgnoreCase("dog")) {
            System.out.println("dog is a pet animal");
        }
        else {
            System.out.println("not a pet animal");
        }


    }
}