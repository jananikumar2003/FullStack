package corejava.controlstmts;
import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please tell us your maths mark");
        int mathsmark=scan.nextInt();


        if(mathsmark>=50)//outerloop
        {
            System.out.println("your are selected(engineer category");
            Scanner scans=new Scanner(System.in);
            System.out.println("please tell us your biology mark");
            int BiologyMark=scans.nextInt();
            if(mathsmark>=50 && BiologyMark>=75)//inner loop
            {

                System.out.println("your selected in medical field and BE category");
                System.out.println("GoodLuck");
            }
            else {
                System.out.println("your not eligible for medical field(only selected BE category");
            }
        }
        else
        {
            System.out.println("your not eligible for engineer and medical field");
        }


    }
}
