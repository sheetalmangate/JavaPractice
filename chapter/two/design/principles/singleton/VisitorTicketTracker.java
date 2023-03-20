package OCP.chapter.two.design.principles.singleton;

/*
* Singleton :: with lazy Instantiation
* */
public class VisitorTicketTracker {

    private static VisitorTicketTracker instance;

    private VisitorTicketTracker(){}

    public static VisitorTicketTracker getInstance(){

        if( instance == null ) {
            instance = new VisitorTicketTracker();
        }

        return instance;
    }

    // Data access methods

}
