package OCP.chapter.three.collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public static void main( String[] args ) {

        List<String> list = new ArrayList<>();
        list.add("Fluffy");
        list.add("Webby");
        System.out.println(list);

        //creating array
        String[] array = new String[list.size()];
        array[0] = list.get(0);
        array[1] = list.get(1);
        for( int i =0; i<array.length; i++ ) {
            System.out.print(array[i]+"-");
        }
        System.out.println();

        //converting between array and arrayList
        System.out.println("---list is backed by array so changes are reflect in both array and ArrayList");
        String[] arrColor = { "Blue", "Green" };
        List<String> listColor = Arrays.asList(arrColor); // [Blue, Green]
        listColor.set(1,"Pink");
        System.out.println(arrColor[1]);
        arrColor[0] = "Red";
        //String[] arr2 = (String[]) listColor.toArray();
        listColor.remove(1);// throw UnsupportedOperationException


        //
    }
}
