package corejava.array;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayinsert {
    public static void main(String[] args) {
        int[] arr=new int[7];
        arr[6]=44;
        arr[5]=33;
        System.out.println(Arrays.toString(arr));
        Scanner get=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("enter the number");
            arr[i]=get.nextInt();
        }
        for (int array:arr){                    // for each loop
            System.out.println(array);
        }
    }
}
