package OCP.chapter.one.inherit.method.equals;

public class Lion {

    private int idNumber;
    private int age;
    private String name;

    public Lion( int idNumber, int age, String name ) {

        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }


    /*@Override
    public boolean equals( Object obj ) {

        if( !(obj instanceof Lion) ) return false;
        Lion otherLion = (Lion) obj;
        return this.idNumber == otherLion.idNumber;

    }*/


    public static void main( String[] args ) {


        Lion l1 = new Lion( 100,4, "lion1");
        Lion l2 = new Lion( 101, 5, "lion2");
        //Lion l3 = new Lion( 100, 14, "lion3");
        Lion l3 = l1;

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));

        /*String s1 = new String( "lion" );
        String s2 = new String("lion" );
        System.out.println(s1.equals(s2));

        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2));*/


    }
}
