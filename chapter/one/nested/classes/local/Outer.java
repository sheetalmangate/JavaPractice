package OCP.chapter.one.nested.classes.local;

public class Outer {

    private int length = 5;

    public void calculate() {

        int w = 2;
        class Inner {

            public void multiply() {
                System.out.println( length*w );
            }
        }

        Inner objInner = new Inner();
        objInner.multiply();

    }

    public static void main( String[] args ) {

        Outer objOuter = new Outer();
        objOuter.calculate();


    }
}
