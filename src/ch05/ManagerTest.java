package ch05;

public class ManagerTest {
    public static void main(String[] args) {

        //construct a Manager object
        var boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        //print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());

        Manager[] managers = new Manager[3];
        Employee[] employees = managers;
        employees[0] = new Employee("Carl Cracker", 80000, 1987, 12, 15);
//        managers[0].setBonus(5000);
//        System.out.println(managers[0]);
    }
}
