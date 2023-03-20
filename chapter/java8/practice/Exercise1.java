package OCP.chapter.java8.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
* Given list of integers find out all even numbers exist in list using stream function
* */

public class Exercise1 {

    public static void main( String[] args ) {

        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> evenNumbers= new ArrayList<>();

        System.out.println("------- Iterating using normal iterator method---------");
        Iterator<Integer> iterateNumbers = numbers.iterator();
        while (iterateNumbers.hasNext()) {

            int num = iterateNumbers.next();
            if( num%2 == 0 ) evenNumbers.add(num);

        }

        evenNumbers.forEach(System.out::println);

        System.out.println("------------iterating through stream ---------------");

        numbers.stream().filter( n -> n%2 == 0 ).forEach(System.out::println);
    }



}
