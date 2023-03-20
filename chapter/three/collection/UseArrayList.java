package OCP.chapter.three.collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args ) {

        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        list.add(0,"NY"); //[NY,SD]
        list.set(1,"FL"); // [NY,FL]
        //list.remove("NY");//[FL]
        //list.remove(0); //[]

        //Looping through a List

        //enhanced for loop
        for( String state : list ) {
            System.out.println(state);
        }

        //older way is with iterator
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            String state = (String) iter.next();
            System.out.println(state);
        }



    }
}
