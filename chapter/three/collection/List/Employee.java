package OCP.chapter.three.collection.List;

public class Employee {

    private int id;
    private String name;
    private int salary;
    private int joiningYear;
    private String technology;

    public Employee( int id, String name, int salary, int joiningYear, String technology ) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningYear = joiningYear;
        this.technology = technology;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return salary;
    }

    public String getTechnology() {
        return technology;
    }

    @Override
    public String toString() {

        return "Emp-id : " +this.id + " :: "+this.name;
    }
}
