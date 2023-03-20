package OCP.chapter.three.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    * Collection interface contains useful methods for working with list,sets and queue
    * add() :: this method inserts a new element into Collection and returns whether it was successful
    * The method Signature is boolean add( E element )
    *
    *
    * */
public class AddMethod {

    public static void main( String[] args ) {

        List<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));

        Set<String> set  = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));

        //List allows duplicate values. Set does not allows duplicate values

     }
}
