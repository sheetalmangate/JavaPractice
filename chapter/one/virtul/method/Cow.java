package OCP.chapter.one.virtul.method;

public class Cow extends Animal{

    public void feed() {
        addHay();
    }

    public void addHay() {
        System.out.println("adding Hay for Cow");
    }
}
