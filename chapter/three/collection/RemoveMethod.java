package OCP.chapter.three.collection;

import java.util.ArrayList;
import java.util.List;

/*
* remove method removes single matching value from collection and returns whether it was successful
*
* boolean remove(Object object)
* */
public class RemoveMethod {

    public static void main(String[] args ) {

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        birds.add("hawk");
        birds.add("Hummingbird");
        System.out.println(birds.remove("sparrow"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds);
        birds.add("Eagle");
        System.out.println(birds.remove(0));
        //birds.remove(100); :: this will throw IndexOutOfBound exception
        System.out.println(birds);

    }
}
