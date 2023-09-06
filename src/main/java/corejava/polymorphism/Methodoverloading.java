package corejava.polymorphism;

public class Methodoverloading {
    public void whatsapp(String name1, String name2){
        if(name1==name2){
            System.out.println("your the one im searching");
        }
        else {
            System.out.println("your not the one");
        }

    }

    public  int whatapp(int age1,int age2)
    {
        int selected=age1;
        System.out.println(selected);
        return selected;
    }
    public void whatsapp(int num,int num1){
        int out=num1+num;
        System.out.println(out);
    }

    public static void main(String[] args) {
        Methodoverloading a= new Methodoverloading();
        a.whatapp(12,13);
        a.whatsapp(21,21);
        a.whatsapp("harini","janani");
    }
}

