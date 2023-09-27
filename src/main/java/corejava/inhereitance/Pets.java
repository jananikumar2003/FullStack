package corejava.inhereitance;

public class Pets implements cat,dog,birds {
    @Override
    public void chirp() {
        System.out.println("birds are chirping");
    }

    @Override
    public void meow() {
        System.out.println("cat meowing");

    }

    @Override
    public void bark()
    {
        System.out.println("dogs are barking");
    }

    public static void main(String[] args) {
        Pets a=new Pets();
        a.bark();
        a.chirp();
        a.meow();
    }
}
