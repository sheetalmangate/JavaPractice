package OCP.chapter.three.collection.List;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise1 {

    public static void main( String[] args ) {

        // create simple list of colors(String) and print it
        List<String> colors = new ArrayList<>();

        colors.add( "Blue" );
        colors.add( "Red" );
        colors.add( "Black" );
        colors.add( "Pink" );
        colors.add( "Green" );
        colors.add( "Green" );

        System.out.println(colors);

        // write code to iterate through all element of list

        for(String color : colors ) {

            System.out.println(color);
        }


    }

}
