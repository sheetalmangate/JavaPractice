package OCP.chapter.one.nested.classes.anonymous;

import OCP.chapter.one.nested.classes.member.A;

public class AnonInner {

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission( int basePrice ) {

        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };

        return basePrice * sale.dollarsOff();
    }

    public static void main( String[] args ) {

        AnonInner objInner = new AnonInner();
        System.out.println( "todays sale is " + objInner.admission( 25 ) );

    }
}
