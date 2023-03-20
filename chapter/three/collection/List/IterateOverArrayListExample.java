package OCP.chapter.three.collection.List;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class IterateOverArrayListExample {

    public static void main( String[] args ) {

        List<String> tvShows = new ArrayList<>();
        tvShows.add( "Breaking Bad" );
        tvShows.add( "The Last of Us" );
        tvShows.add( "Game of Thrones" );
        tvShows.add( "Rick and Morty" );
        tvShows.add( "The Office" );
        tvShows.add( "Better Call Saul " );
        tvShows.add("Friends");
        tvShows.add("Prison Break");


        System.out.println("------------Iterate using JAVA 8 ForEach and Lambda----------");
        tvShows.forEach( tvShow -> { System.out.println(tvShow);} );


        System.out.println("------------Iterate through iterator()----------");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while ( tvShowIterator.hasNext() ) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("----------Iterate using listIterator() to traverse in both direction----------");
        ListIterator<String> tvShowListIterator = tvShows.listIterator( tvShows.size());
        while( tvShowListIterator.hasPrevious() ) {
            String tvShow =  tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("----------Iterate using simple for-each loop----------");
        for( String tvShow : tvShows ) {
            System.out.println(tvShow);
        }

        System.out.println("----------Iterate using for loop with index----------");

        for( int i =0; i<tvShows.size();i++) {
            System.out.println(tvShows.get(i));
        }
    }

}
