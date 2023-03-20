package OCP.chapter.three.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class UseSetMethods {

    public static void main(String[] args ) {

        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66));
        System.out.println(set.add(10));
        System.out.println(set.add(66));
        System.out.println(set.add(8));
        for(Integer num : set ) {
            System.out.print(num + ",");
        }


        Set<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet.add(66));
        System.out.println(treeSet.add(10));
        System.out.println(treeSet.add(66));
        System.out.println(treeSet.add(8));
        for(Integer num : treeSet ) {
            System.out.print(num + ",");
        }


        System.out.println();
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for( int i = 1; i<=20; i++ ) {
            navigableSet.add(i);
        }


       System.out.println(navigableSet.lower(15));
        System.out.println(navigableSet.floor(15));
        System.out.println(navigableSet.ceiling(18));
        System.out.println(navigableSet.higher(18));
    }
}
