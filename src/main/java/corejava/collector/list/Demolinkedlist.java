package corejava.collector.list;

import java.util.LinkedList;

public class Demolinkedlist {
    public static void main(String[] args) {

        LinkedList<Character> rank=new LinkedList<Character>();
        rank.add('q');
        rank.add('h');
        rank.add('j');
        rank.addFirst('a');
        rank.add(2,'u');
        rank.remove(3);
        rank.set(3,'e');
        System.out.println(rank.indexOf('e'));
        System.out.println(rank);
        System.out.println("rank in 3th index:" +rank.get(3));

    }
}
