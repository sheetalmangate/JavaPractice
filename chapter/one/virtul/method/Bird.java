package OCP.chapter.one.virtul.method;

public class Bird extends Animal{

    public void feed() {
        addSeed();
    }

    public void addSeed() {
        System.out.println("adding seeds for Bird");
    }

}
