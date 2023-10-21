package corejava.collector;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset1 {
    public static void main(String[] args) {
        TreeSet<waterbottle> bottleshop=new TreeSet<waterbottle>();

        waterbottle customer1=new waterbottle("blue",1,500,"tupperware");
        waterbottle customer2=new waterbottle("red",1.5f,550,"signoraware");
        waterbottle customer3=new waterbottle("violet",2,600,"milton");
        waterbottle customer4=new waterbottle("pink",2.5f,650,"cello");
        waterbottle customer5=new waterbottle("black",2,700,"silicone");

        bottleshop.add(customer1);
        bottleshop.add(customer2);
        bottleshop.add(customer3);
        bottleshop.add(customer4);
        bottleshop.add(customer5);
        Iterator group=bottleshop.iterator();
        while (group.hasNext()){
            System.out.println(group.next()+"\n");
        }
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor

class waterbottle implements Comparable<waterbottle>{

    String bottlecolour;
    float bottlelitre;
    int bottleprice;
    String bottlebrand;

    @Override
    public int compareTo(waterbottle o) {

        return o.bottlecolour.compareTo(bottlecolour);
    }
}
