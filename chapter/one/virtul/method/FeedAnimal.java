package OCP.chapter.one.virtul.method;

public class FeedAnimal {

    public void feedAnimal( Animal animal ) {
        animal.feed();
    }


    public static void main( String[] args ) {

        //Virtual method invocation :: Java looks at actual type of animal at runtime sand call feed method on that
        // instead of calling feed method on Animal instance
        FeedAnimal objFeed = new FeedAnimal();
        objFeed.feedAnimal( new Cow() );
        objFeed.feedAnimal( new Lion() );
        objFeed.feedAnimal( new Bird() );


    }
}
