package ch04;

import ch04.com.icenotu.corejava.Employee;
import static java.lang.System.*;

public class PackageTest {
    //because of the import statement, we don't have to use
    // ch04.com.icenotu.corejava.Employee here
    public static void main(String[] args) {
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        harry.raiseSalary(5);

        //because of the static import statement, we don't have to use System.out here
        out.printf("name= %s, salary= %.2f", harry.getName(), harry.getSalary());
    }

}
