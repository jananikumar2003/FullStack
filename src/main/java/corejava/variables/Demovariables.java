package corejava.variables;

public class Demovariables {
    static String name="janani"; //static
    String name1="gokul"; //gobal
    public void Ans(){
        String name2="kriths"; //local
        System.out.println(name1);
        System.out.println(name2);
    }


    public static void main(String[] args) {
        int a=10;          //instance
        int b=12;
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        Demovariables q=new Demovariables();
        q.Ans();

    }

}
