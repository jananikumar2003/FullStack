package corejava.stringmethod;

public class string2 {
    public static void main(String[] args) {
        String a="janani";
        String a1=new String("Janani");
        String a2="priya";
        String a3="dharshini";
        System.out.println(a.equals(a1));
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));
        System.out.println(a.equalsIgnoreCase(a1));
        System.out.println(a==a1);
        System.out.println(a.compareTo(a1));
    }
}
