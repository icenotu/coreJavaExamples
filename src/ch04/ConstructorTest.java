package ch04;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee3 objects
        var staff = new Employee3[3];

        staff[0] = new Employee3("Harry", 40000);
        staff[1] = new Employee3(60000);
        staff[2] = new Employee3();

        //print out information about all Employee3 objects
        for (Employee3 e : staff) {
            System.out.println(e);
        }
    }
}

class Employee3{
    private static int nextId;

    private int id;
    private String name = ""; //instance field initialization
    private double salary;

    //static initialization block
    static {
        var generator = new Random();
        //set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    //three overloaded constructors

    public Employee3(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee3(double salary) {
        //call the Employee(String, double) constructor
        this("Employee #" + nextId, salary);
    }

    public Employee3() {
        //name initialization to "" --see above
        //salary not explicitly set --initialized to 0
        //id initialized in initialization block
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
