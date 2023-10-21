package corejava.exception;

public class Arithmeticexception {
    public static void main(String[] args) {
        try
        {
            int a = 100;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException a)
        {
            System.out.println(a);
        }
    }
}
