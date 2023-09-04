package corejava.controlstmts;

public class Elseif {
    public static void main(String[] args) {
        String a="tom";
        String b="jerry";
        String c="naruto";
        if(a==b){
            System.out.println("tom and jerry");
        }
        else if(a==c){
            System.out.println("not tom and jerry");
        }
        else if (b==c){
            System.out.println("i like tom and jerry");
        }
        else {
            System.out.println("i like naruto");
        }
    }
}
