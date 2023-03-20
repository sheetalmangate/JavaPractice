package OCP.chapter.one.inherit.method.tostring;

public class Hippo {

    private String name;
    private double weight;

    public Hippo( String name, double weight ) {

        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString( ) {

        return "name: "+this.name+" weight : "+this.weight;
    }

    public static void main( String[] args ) {

        Hippo objHippo1 = new Hippo( "hippo1", 123.2 );
        System.out.println(objHippo1);
    }
}

