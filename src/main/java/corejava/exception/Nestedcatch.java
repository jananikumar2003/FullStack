package corejava.exception;

import java.util.InputMismatchException;

import java.util.Scanner;
public class Nestedcatch {
    public static void main(String[] args) {
        Scanner ans=new Scanner(System.in);
        int clock=0;
        int block=0;
        try
        {
            System.out.println("enter the first number");
            clock=ans.nextInt();
            System.out.println("enter the second number");
            System.out.println(clock/block);
        }
        catch (ArithmeticException e){
            System.out.println("cannot be divided by zero");
            block=ans.nextInt();
            System.out.println(clock/block);
        }
        catch (InputMismatchException e1){
            Scanner answer=new Scanner(System.in);
            System.out.println("only numeric numbers");
            clock=answer.nextInt();
            block=answer.nextInt();
            System.out.println(clock/block);

        }
    }
}
