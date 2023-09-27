package corejava.stringmethod;

public class Stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("janani");
        s.append("priya");
        System.out.println(s);
        s.insert(9,"  ");
        System.out.println(s);

    }
}
