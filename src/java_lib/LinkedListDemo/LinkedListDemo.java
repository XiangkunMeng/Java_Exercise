package java_lib.LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by mxk94 on 2017/3/25.
 */
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String co) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = co;
    }

    @Override
    public String toString() {
        return name + "\t" + street + "\t" + city + "\t" + state + "\t" + code + "\n";
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(new Address("Xkenmon", "YingZe", "Taiyun", "Shanxi", "CN"));
        ll.add(new Address("Ludan", "Wenjing", "Jinzhong", "Shanxi", "CN"));
        Iterator itr = ll.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();
            System.out.print(obj);
        }
    }
}
