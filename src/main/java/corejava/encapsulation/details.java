package corejava.encapsulation;
class student
{
    public int age;
    public String name;
    public String cname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String sname;


}
public class details {
    public static void main(String[] args) {
        student a=new student();
        a.setAge(21);
        a.setName("janani");
        a.setSname("cluny");
        a.setCname("sona");

        student a1=new student();
        a1.setAge(20);
        a1.setName("pooja");
        a1.setCname("sona");
        a1.setSname("holy angels");

        System.out.println(a.getAge()+"\n"+a.getName()+"\n"+a.getCname()+"\n"+a.getSname());
        System.out.println(a1.getAge()+"\n"+a1.getName()+"\n"+a1.getSname()+"\n"+a1.getCname());
    }
}
