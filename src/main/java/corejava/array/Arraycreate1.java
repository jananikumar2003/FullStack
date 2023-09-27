package corejava.array;

import java.util.Arrays;

public class Arraycreate1 {
    public static void main(String[] args) {
        int[] a1 = {11, 22, 3, 33, 44, 55};
        int[] a2 = new int[6];
        System.out.println(a1.length);
        for (int i=0;i<a1.length;i++){
           System.out.println(a1[i]);
         }
        for (int hi:a1){
            System.out.println(hi);
        }
        System.out.println(Arrays.toString(a1));
    }
}
