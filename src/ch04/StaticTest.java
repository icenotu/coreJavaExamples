package ch04;

public class StaticTest {
    public static void main(String[] args) {
        //fill the staff array with three Employee1 Objects
        var staff = new Employee1[3];

        staff[0] = new Employee1("Tom", 40000);
        staff[1] = new Employee1("Dick", 60000);
        staff[2] = new Employee1("Harry", 65000);

        //print out information about all Employee1 objects
        for (Employee1 e : staff) {
            e.setId();
            System.out.printf("name=%s,id=%d,salary=%g %n",e.getName(),e.getId(),e.getSalary());
        }

        int n = Employee1.getNextId();
        System.out.println("Next available id=" + n);
    }

}
class Employee1{
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee1(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId; //returns static field
    }

    public static void main(String[] args) {
        // unit test
        var e = new Employee1("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
