package corejava.array;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayupdate {
    public static void main(String[] args) {
        String [] subjects={"tamil","english","maths","science","social"};
        System.out.println("before updating values");
        System.out.println(Arrays.toString(subjects));

        Scanner get=new Scanner(System.in);
        System.out.println("position to update");
        int pos= get.nextInt();
        System.out.println("replace?");
        String name=get.next();
        subjects[pos]=name;
        System.out.println("updated value");
        System.out.println(Arrays.toString(subjects));
    }
}

