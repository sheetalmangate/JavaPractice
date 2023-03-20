package OCP.chapter.two.design.principles.encapsulation;

public class Animal {

    private String species;
    private int age;


    public Animal(String species ) {

        this.setSpecies(species);
    }
    public void setAge( int age ) {
        if( age < 0 ) throw new IllegalArgumentException(" age should not be less than 0");
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public void setSpecies( String species ) {

        if( species == null || species.trim().length() == 0 ) throw new IllegalArgumentException("Species is required");
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Animal species is "+this.species+" and age is "+this.age;
    }

}
