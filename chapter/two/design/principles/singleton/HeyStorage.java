package OCP.chapter.two.design.principles.singleton;

/*
* Problem :: manage the amount of hay available for food to zoo animals across all classes
*
* */
public class HeyStorage {

    private int quantity = 0;
    private HeyStorage() {}

    //private static final HeyStorage instance = new HeyStorage();
    private static HeyStorage instance;

    public static HeyStorage getInstance() {

        if( instance == null ) {

            instance = new HeyStorage();
        }
        return instance;
    }

    public synchronized void addHey( int amount ) {

        quantity = amount;
    }

    public synchronized boolean removeHey( int amount ) {

        if( quantity < amount ) return false;
        quantity -= amount;
        return true;
    }

    public synchronized int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "Hey Quantity " + quantity;
    }
}
