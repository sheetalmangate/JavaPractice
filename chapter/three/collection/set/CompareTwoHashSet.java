package OCP.chapter.three.collection.set;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.function.Consumer;

public class CompareTwoHashSet {
    public static void main( String[] args ) {

        Set<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Blue");
        set1.add("White");

        Set<String> set2 = new TreeSet<>();
        set2.add("Red");
        set2.add("Pink");
        set2.add("Black");
        set2.add("White");
        //Consumer<String> s = System.out::println;

    }
}
