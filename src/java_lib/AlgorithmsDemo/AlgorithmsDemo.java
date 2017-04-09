package java_lib.AlgorithmsDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by mxk94 on 2017/3/30.
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(new Integer(3));
        ll.add(new Integer(4));
        ll.add(new Integer(6));
        ll.add(new Integer(5));

        Comparator r = Collections.reverseOrder();
        Collections.sort(ll,r);
        Iterator li = ll.iterator();
        while(li.hasNext()){
            System.out.print(li.next()+"\t");
        }
        Collections.shuffle(ll);
        System.out.println("\nafter Call shuffle():");
        li = ll.iterator();
        while(li.hasNext()){
            System.out.print(li.next()+"\t");
        }
    }
}
