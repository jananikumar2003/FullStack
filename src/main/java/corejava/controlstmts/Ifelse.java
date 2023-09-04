package corejava.controlstmts;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner ans=new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=ans.nextInt();
        if (age>=18){
            System.out.println("eligible to vote ");
        }
        else {
            System.out.println("not eligible to vote 30");
        }
    }
}
