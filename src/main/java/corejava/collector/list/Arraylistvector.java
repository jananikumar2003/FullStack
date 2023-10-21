package corejava.collector.list;

import java.util.ArrayList;
import java.util.Vector;

public class Arraylistvector {
    public static void main(String[] args) {
        ArrayList details=new ArrayList();

        details.add("janani");
        details.add(20);
        details.add("salem");
        details.add("sona college");
        details.add(7373787264l);

        Vector details1=new Vector();

        details1.addAll(details);
        details1.add("tamilnadu");
        details1.add(155.33f);

        System.out.println("arraylist :"+details);
        System.out.println("vector :"+details1);
          details.removeAll(details1);

    }
}
