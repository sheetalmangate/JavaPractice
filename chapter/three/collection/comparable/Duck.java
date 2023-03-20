package OCP.chapter.three.collection.comparable;

import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Duck implements Comparable<Duck>{

    private String name;

    public Duck( String name) {
       this.name = name;
    }


    public String toString() {
        return name;
    }

    public int compareTo( Duck d ) {
        return name.compareTo( d.name );
    }

    public static void main( String[] args ) {

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        ducks.add(new Duck("Goose"));
        ducks.add(new Duck("Bill"));
        Collections.sort(ducks);
        System.out.println(ducks);

    }
}
