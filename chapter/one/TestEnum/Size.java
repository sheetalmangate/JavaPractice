package OCP.chapter.one.TestEnum;

public enum Size {

    //enum constant calling the enum constructor
    SMALL( "The Size is Small" ),
    MEDIUM( "The Size is Medium" ),
    LARGE( "The Size is Large" ),
    EXTRALARGE( "The Size is Extra-large" );

    private String size;
    private Size( String s ) {

        this.size = s;
    }

    public String printSize() {
        return size;
    }
}
