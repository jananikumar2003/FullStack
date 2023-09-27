package corejava.task;
import java.util.Scanner;

public class Vowels1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the letter");
        char letter =scan.next().charAt('a');
        switch (letter)
        {
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowels");
                break;
                case 'i':
                System.out.println("i is vowels");
                break;
            case 'o':
                System.out.println("o is vowels");
                break;
            case 'u':
                System.out.println("u is vowels");
                break;
            default:
                System.out.println("it is not a vowels");
        }
    }



}
