package ch05;

public class ObjectAnalyzerTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        var oa = new ObjectAnalyzer();
        System.out.println(oa.toString(harry));
        System.out.println(oa.toString(harry));
    }
}

