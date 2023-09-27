package corejava.array;
import java.util.Arrays;
import java.util.Scanner;
public class Arraypassing {
    public void Arraypassing(double[] luckyno){
        luckyno[4]=12.33;
        luckyno[2]=11.22;
        System.out.println(Arrays.toString(luckyno));
    }
    public void Arraypassing2(String name){
        System.out.println("jaan");
    }
    public static void main(String[] args) {
        String name="janani";
        double [] luckynumber={1,2,3,4,5};
        Arraypassing pass=new Arraypassing();

        System.out.println();

    }
}
