package corejava.stringmethod;

public class string3 {
    public static void main(String[] args) {
        String a="janani";
        System.out.println(a.startsWith("j"));
        System.out.println(a.endsWith("i"));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(3));
        System.out.println(a.length());
        String s="so proud";
        String replace=s.replace("proud","nice");
        System.out.println(replace);
        String s1="dhanya loves janani";
        String s2=s1.replace("janani","boomesh");
        System.out.println(s2);

    }
}
