package OCP.chapter.one.virtul.method;

import java.util.ArrayList;

public class PlayWithAnimal {

    public static void main( String[] args ) {

        Animal animal = new Lion();
        animal.printName();

        ArrayList<String> list = new ArrayList<>();
        list.add("Sheetal");
        System.out.println(list);
    }
}
