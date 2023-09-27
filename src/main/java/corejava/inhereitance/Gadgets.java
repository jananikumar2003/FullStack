package corejava.inhereitance;

public class Gadgets extends Theatre implements Tv,Speaker{
    public void electronics(){
        System.out.println("all are electronics");
    }
    @Override
    public void sound()
    {
        System.out.println("the sound is from speaker");
    }

    @Override
    public void show() {
        System.out.println("the show is telecasted in tv");

    }

    public static void main(String[] args) {
        Gadgets a=new Gadgets();
        a.sound();
        a.movie();
        a.show();
        a.electronics();
    }
}
