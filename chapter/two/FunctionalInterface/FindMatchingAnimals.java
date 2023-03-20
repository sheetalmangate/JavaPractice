package OCP.chapter.two.FunctionalInterface;

public class FindMatchingAnimals {

    private static void print( Animal animal, CheckTrait trait ) {

        if( trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main( String[] args ) {

        print( new Animal( "fish", false, true ), b -> b.canSwim());
        print( new Animal( "kangaroo", true, false), b -> b.canHop());
    }
}


