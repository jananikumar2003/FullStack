package corejava.collector.list;

import java.util.Stack;

public class Stacklist {
    public static void main(String[] args) {
        Stack<Integer> ages=new Stack<Integer>();

        ages.push(19);
        ages.push(20);
        ages.push(21);
        ages.push(22);
        System.out.println(ages);

        ages.pop();
        System.out.println(ages);

        System.out.println("top value"+ages.peek());
        System.out.println("value is 20=="+ages.search(20));
    }
}
