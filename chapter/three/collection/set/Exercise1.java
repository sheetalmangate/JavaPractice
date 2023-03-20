package OCP.chapter.three.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

//append the element to the end of hash set
public class Exercise1 {

    public static void main( String[] args ) {

        Set<String> setOfColors = new HashSet<>();
        setOfColors.add("Red");
        setOfColors.add("Green");
        setOfColors.add("Blue");
        setOfColors.add("Yellow");
        setOfColors.add("Pink");
        setOfColors.add("Red");

        //System.out.println( setOfColors );
        //using iterator
        Iterator<String> setIterator = setOfColors.iterator();
        while( setIterator.hasNext() ) {
            System.out.println( setIterator.next() );
        }

        //using forEach
        setOfColors.forEach( color -> {System.out.println(color);});

        //number of element in hasSet
        System.out.println(setOfColors.size());

        //clone hashSet
       /* HashSet<String> newSetOfColor = new HashSet<>();
        newSetOfColor = (HashSet)setOfColors.clone();*/

        //empty hash set
        System.out.println("----------------Empty hasSet-------------");
        setOfColors.clear();
        System.out.println(setOfColors.isEmpty());
    }
}
