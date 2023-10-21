package corejava.exception;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        String name = "bhuvana";
        Scanner ans = new Scanner(System.in);
        try
        {
            System.out.println("please tell us which index");
            System.out.println(name.charAt(ans.nextInt()));

        }
        catch (StringIndexOutOfBoundsException a)
        {
            System.out.println(a);
            System.out.println("index should be less then"+name.length());
            System.out.println(name.charAt(ans.nextInt()));
        }
        finally
        {
            System.out.println("thanks");
        }
    }
}
