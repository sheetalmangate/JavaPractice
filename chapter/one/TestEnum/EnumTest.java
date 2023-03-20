package OCP.chapter.one.TestEnum;

enum Season{

    WINTER, FALL, SUMMER, SPRING
}
public class EnumTest {

    Season season;

    public EnumTest( Season s ) {
        this.season = s;
    }

    public void printZooTiming() {
        switch (season) {
            case WINTER :
                System.out.print("9-3 pm");
                break;
            case SUMMER:
                System.out.print("9-7 pm");
                break;
            case SPRING:
            case FALL :
                System.out.print("9-5 pm");
                break;
        }

    }

    public static void main( String[] args ) {

        EnumTest obj = new EnumTest(Season.SUMMER);
        obj.printZooTiming();
    }
}
