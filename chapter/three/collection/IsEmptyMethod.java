package OCP.chapter.three.collection;

import java.util.ArrayList;
import java.util.List;

/*
*   isEmpty() and size() method looks how many elements are in Collection.
*
*   boolean isEmpty()
*   int size()
*
* */
public class IsEmptyMethod {

    public static void main( String[] args ) {


        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.add("Hawk");
        birds.add("Hawk");
        System.out.println("------------after adding elements-----");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());



    }
}
