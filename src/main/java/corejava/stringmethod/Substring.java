package corejava.stringmethod;

import java.util.Locale;

public class Substring {
    public static void main(String[] args) {
        String ans="janani priyadharshini";
        System.out.println(ans.substring(8));
        System.out.println(ans.substring(0,6));
        System.out.println(ans.toLowerCase());
        System.out.println(ans.toUpperCase());
        System.out.println(ans.trim());
        String a="pooja";
        System.out.println(a+"shri");
        System.out.println(a.trim()+"shri");
    }
}
