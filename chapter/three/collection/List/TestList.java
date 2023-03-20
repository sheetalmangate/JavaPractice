package OCP.chapter.three.collection.List;

import java.util.List;
import java.util.ArrayList;

public class TestList {

    public static void main( String[] args ) {

        List<Employee> empList = new ArrayList<>();
        empList.add( new Employee(1, "Sheetal",2000, 2006, "Java"));
        empList.add( new Employee(2, "Prashant",5000, 2006, "Spring"));
        empList.add( new Employee(3, "Mihir",1000, 2022, "C++"));
        empList.add( new Employee(4, "Prisha",1000, 2023, "iready"));
        //System.out.println( empList );

        //iterate through all element id list
        empList.forEach( employee -> {
            if( employee.getSalary() < 2000 ) {
                System.out.println(employee);
            }
        });

    }

}
