package OCP.chapter.two.design.principles.encapsulation;

public class UseAnimal {

    public static void main( String[] args ) {

        Animal animal = new Animal( "Tiger" );
        animal.setAge(0);

        System.out.println(animal);
    }

}
