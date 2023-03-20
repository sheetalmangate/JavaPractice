package OCP.chapter.one.virtul.method;

public abstract class Animal {

    String name = "???";

    public void printName() {
        System.out.println("name of Animal is : " + name);
    }

    public abstract void feed();


}
