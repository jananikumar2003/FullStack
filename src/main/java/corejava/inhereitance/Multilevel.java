package corejava.inhereitance;
class college
{
    public void high(){
        String name="sona college";
        String address="suramangalam";
        System.out.println("college name is "+name);
        System.out.println("address of the college is "+address);
    }
}
class school extends college
{
    public void low(){
        String name1="cluny";
        String address1="4roads";
        System.out.println("school name is "+name1);
        System.out.println("address of the school is "+address1);
    }
}
class playschool extends school
{
    public void midlow(){
        System.out.println("kidzzz");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        playschool ans=new playschool();
        ans.midlow();
        ans.low();
        ans.high();
    }
}
