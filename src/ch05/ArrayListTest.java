package ch05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String... args) {
        var staff = new ArrayList<Employee>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e: staff) {
            System.out.println("name= " + e.getName() + ", salary= " + e.getSalary() + ", hireDay= " + e.getHireDay());
        }
        System.out.println(Arrays.toString(staff.toArray()));
}
    }

