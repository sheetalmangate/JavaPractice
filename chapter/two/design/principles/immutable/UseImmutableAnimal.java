package OCP.chapter.two.design.principles.immutable;

import OCP.chapter.one.nested.classes.member.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseImmutableAnimal {


    public static void main( String[] args ) {

        List<String> animalsFavoriteFood = new ArrayList<>();
        animalsFavoriteFood.add("Milk");
        animalsFavoriteFood.add("Meat");

        Animal lion = new Animal("Lion",5, Arrays.asList("Meat","More meat"));
        //create new Animal using data from first instance

        System.out.println( lion.getFavoriteFoods() );
        lion.getFavoriteFoods().clear();
        lion.getFavoriteFoods().add("flesh");
        System.out.println( lion.getFavoriteFoods() );
       /* List<String> favoriteFood = new ArrayList<>();
        for( int i =0; i< lion.getFavoriteFoodCount(); i++ ) {

            favoriteFood.add(lion.getFavoriteFoods(i));
        }
        Animal updatedLion = new Animal( lion.getSpecies(), lion.getAge(), favoriteFood );*/
    }
}
