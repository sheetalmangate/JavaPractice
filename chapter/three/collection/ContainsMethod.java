package OCP.chapter.three.collection;


import java.util.ArrayList;
import java.util.List;

/*
*  contains() method check if certain value is in collection. method signature is
*
* boolean contains(Objet object )
*
* This method calls equals() on each element of ArrayList() to see if there are any matches
*
* */
public class ContainsMethod {

    public static void main( String[] args ) {


        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1,"sparrow");
        birds.add(2,"Robin");
        birds.add(2,"Robinaaaa");
        System.out.println(birds);
        System.out.println(birds.contains("Hawk"));
        System.out.println(birds.contains("hawk"));

    }
}
