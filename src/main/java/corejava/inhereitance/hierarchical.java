package corejava.inhereitance;
class friends1
{
    public void jan(){
        String name="janani";
        System.out.println("first one is "+name);
    }
}
class friend2 extends friends1
{
    public void pooj(){
        String name2="pooja shri";
        System.out.println("second one is "+name2);
    }
}
class friends3 extends friends1
{
    public void rup(){
        String name3="rupa shri";
        System.out.println("third one is "+name3);
    }
}
public class hierarchical {
    public static void main(String[] args) {
        friends3 s=new friends3();
        s.rup();
        s.jan();
        friend2 r=new friend2();
        r.pooj();
    }
}

