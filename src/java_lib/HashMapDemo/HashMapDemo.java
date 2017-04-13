package java_lib.HashMapDemo;

import java.util.*;

/**
 * Created by mxk94 on 2017/3/27.
 */
class MyComp implements Comparator {
    public int compare(Object a, Object b) {
        String string_a = a.toString();
        String string_b = b.toString();
        return string_b.compareTo(string_a);
    }
}

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, "xkenmon");
        hm.put(3, "Mix");
        hm.put(4, "LuDan");
        hm.put(2, "Sunny");
        Object ob1 = hm.get(1);
        System.out.println("ob1 = " + ob1);
        final boolean replace = hm.replace(1, "xkenmon", "Xkenmon");
        System.out.println("after changed :");
        ob1 = hm.get(1);
        System.out.println("ob1 = " + ob1);
        Set st = hm.entrySet();
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            Object ob = itr.next();
            System.out.println(ob);
        }
        System.out.println();
//        itr = hm.keySet().iterator();
        Iterator itr_1 = hm.keySet().iterator();
        while (itr_1.hasNext()) {
            Object ob = itr_1.next();
            System.out.println(ob.toString() + " : " + hm.get((int) ob));
        }
        System.out.println();
        TreeMap tm = new TreeMap(new MyComp());
        tm.putAll(hm);
        Iterator itr_tm = tm.entrySet().iterator();
        for (Object ob; itr_tm.hasNext(); ) {
            ob = itr_tm.next();
            System.out.println(ob);
        }
    }
}
