package OCP.chapter.three.collection;


/*
* clear() method provides an easy way to discard all elements of Collection
*
* void clear();
* */


import java.util.ArrayList;
import java.util.List;

public class ClearMethod {

    public static void main(String[] args ) {

        List<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add("Hawk");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.clear();
        System.out.println("------------after clearing elements-----");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());

    }
}
