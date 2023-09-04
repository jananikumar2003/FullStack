package corejava.scanner;
import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner ans=new Scanner(System.in);
        System.out.println("enter data1= ");
        int data1=ans.nextInt();
        System.out.println("enter data2= ");
        int data2=ans.nextInt();
        int result=data1+data2;
        System.out.println("result is=  "+result);

    }
}
