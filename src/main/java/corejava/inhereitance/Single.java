package corejava.inhereitance;
class earth
{
    public void water(){
        System.out.println("earth has water");
    }
}
class sun extends earth
{
    public void heat(){
        System.out.println("sun produce heat");
    }
}
public class Single {
    public static void main(String[] args) {
        sun ans=new sun();
        ans.heat();
        ans.water();
    }
}
