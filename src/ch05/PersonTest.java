package ch05;

public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];

        people[0] = new Employee("Chris Young", 50000, 1986 , 10, 29);
        people[1] = new Student("Vincent Young", "Financal Management");

        for (Person p: people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}