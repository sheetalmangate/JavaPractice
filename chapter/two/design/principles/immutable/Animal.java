package OCP.chapter.two.design.principles.immutable;

import java.util.ArrayList;
import java.util.List;
public final class Animal {

    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    public Animal( String species, int age, List<String> favoriteFoods ) {

        this.species = species;
        this.age = age;

        if( favoriteFoods == null ) {
            throw new RuntimeException("Favorite food is require");
        }

        this.favoriteFoods = new ArrayList<>( favoriteFoods );
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public int getFavoriteFoodCount() {
        return this.favoriteFoods.size();
    }

    /*public String getFavoriteFoods( int index ) {
        return favoriteFoods.get(index);
    }*/

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

}
