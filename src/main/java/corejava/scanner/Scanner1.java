package corejava.scanner;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = ans.next();
        System.out.println("my name is" + name);
        System.out.println("enter the age");
        int age = ans.nextInt();
        System.out.println("age is" + age);

    }
}
