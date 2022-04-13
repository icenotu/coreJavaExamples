package ch03;

public class ArithmeticOperators {


    public static void main(String[] args) {
        int a = 12;
        double b = 12.0;
        float c = 0.0f;
        System.out.println(a / 0);  // result--->ArithmeticException
        System.out.println(b / 0);  // result--->Infinity
        System.out.println(c / 0);  // result--->NaN
    }
}
