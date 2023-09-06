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
}
public class details {
    public static void main(String[] args) {
        student a=new student();
        a.setAge(21);
        a.setName("janani");
        a.setCname("sona");

        student a1=new student();
        a1.setAge(20);
        a1.setName("pooja");
        a1.setCname("sona");

        System.out.println(a.getAge()+"\n"+a.getName()+"\n"+a.getCname());
        System.out.println(a1.getAge()+"\n"+a1.getName()+"\n"+a1.getCname());
    }
}
