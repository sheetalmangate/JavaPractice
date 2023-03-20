package OCP.chapter.one.virtul.method;

public class Lion extends Animal{

    public String name = "Lion";

    public void feed() {
        addMeat();
    }

    public void addMeat() {
        System.out.println("adding meat for Lion");
    }

}
