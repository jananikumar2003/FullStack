package corejava.abstraction;

public class implement2 extends addition{
    @Override
    public void multiple(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        implement2 a=new implement2();
        a.multiple(44,55);
        a.additional(3,5);
        a.add(5,7);
    }
}
