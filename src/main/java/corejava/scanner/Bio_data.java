package corejava.scanner;

import java.util.Scanner;

public class Bio_data {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        System.out.println("enter the name: ");
        String name = ans.next();
        System.out.println("my name is  " +name);
        System.out.println("enter the age: ");
        int age = ans.nextInt();
        System.out.println("age is " + age);
        System.out.println("enter your qualification ");
        String qualification=ans.next();
        System.out.println("my qualification is  "+qualification);
        System.out.println("enter your hobby:");
        String hobby=ans.next();
        System.out.println("my hobby is  "+hobby);

    }
}