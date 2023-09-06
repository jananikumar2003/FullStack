package corejava.polymorphism;

public class methodoverriding2 {
    public void placename(String place1,String place2){
        if(place1=="new york"){
            System.out.println("your favourite");
        }
        else if (place2=="korea") {
            System.out.println("its your favourite");
        }
        else {
            System.out.println("nothing is matched");
        }
    }
}
