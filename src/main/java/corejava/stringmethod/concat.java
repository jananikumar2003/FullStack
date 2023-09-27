package corejava.stringmethod;

public class concat {
    public static void main(String[] args) {
        String a="janani "+"is "+"good "+"girl ";
        System.out.println(a);
        String a1="janani ";
        String a2="is ";
        String a3="good";
        String a4="girl";
        System.out.println(a1+a2);
        System.out.println(a1.concat(a2));
        System.out.println(a2.concat(a3));
        System.out.println(a3.concat(a4));
    }
}
