package corejava.abstraction;

public class implement1 extends addition{

    @Override
    public void multiple(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
    }

    public static void main(String[] args) {
        implement1 a=new implement1();
        a.add(44,55);
        a.multiple(44,55);
    }
}
