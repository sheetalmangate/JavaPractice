package OCP.chapter.two.design.principles.singleton;

public class LamaTrainer {

    public boolean feedLamas( int numberOfLamas ) {

        int amountNeeded = 5 * numberOfLamas;
        HeyStorage heyStorage = HeyStorage.getInstance();
        if( heyStorage.getQuantity() <  amountNeeded ) {

            heyStorage.addHey(amountNeeded+10 );
        }

        boolean fed = heyStorage.removeHey(amountNeeded);
        if( fed ) System.out.println("lamas have been fed");

        return fed;
    }

    public static void main( String[] args ) {

        LamaTrainer lamaTrainer  = new LamaTrainer();
        lamaTrainer.feedLamas( 2 );

        HeyStorage heyStorage1 = HeyStorage.getInstance();
        HeyStorage heyStorage2 = HeyStorage.getInstance();
        System.out.println(heyStorage1);
        System.out.println(heyStorage2);

    }
}
