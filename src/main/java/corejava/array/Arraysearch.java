package corejava.array;
import java.util.Scanner;
public class Arraysearch {
    public static void main(String[] args) {
        String [] songs={"happier","shy","super","money","tally"};
        Scanner get=new Scanner(System.in);
        System.out.println(songs.length);
        System.out.println("what is your favorite song");
        String favor=get.next();
        for (int pos=0;pos<songs.length;pos++){
            if (favor.equalsIgnoreCase(songs[pos])){
                System.out.println(favor+"song is found");
                return;
            }
        }
        System.out.println(favor+"song is not found");

    }


}
