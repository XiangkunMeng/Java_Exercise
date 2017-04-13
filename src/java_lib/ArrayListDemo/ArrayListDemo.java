package java_lib.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by mxk94 on 2017/3/24.
 */
//        1.使用范围不同，Iterator可以应用于所有的集合，Set、List和Map和这些集合的子类型。而ListIterator只能用于List及其子类型。
//
//        2.ListIterator有add方法，可以向List中添加对象，而Iterator不能。
//
//        3.ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向（顺序向前）遍历。Iterator不可以。
//
//        4.ListIterator可以定位当前索引的位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。
//
//        5.都可实现删除操作，但是ListIterator可以实现对象的修改，set()方法可以实现。Iterator仅能遍历，不能修改。
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Integer(1));
        al.add(new Integer(2));
        al.add(new Integer(3));
        System.out.println("Contents of ArrayList: " + al);
//        int sum = 0;
//        Object arr[] = al.toArray();
//        for (int i = 0; i < al.size(); i++) {
//            sum += ((Integer)arr[i]).intValue();
//        }
//        System.out.println("sum: " + sum);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Object item = itr.next();
            System.out.print(item + "\t");
        }
        System.out.println();
        ListIterator litr = al.listIterator();
        while(litr.hasNext()){
            Object item = litr.next();
            litr.set(item+ "+");
        }
        System.out.println();
        while (litr.hasPrevious()){
            Object item = litr.previous();
            System.out.println(item+"\t");
        }
    }
}
