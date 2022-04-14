package ch03;

import java.util.*;

public class Retirement {
    public static void main(String[] args) {
        // read input
        Scanner input = new Scanner(System.in);

        System.out.println("How much money do you need to retire?");
        double goal = input.nextDouble();

        System.out.println("How much money will you contribute every year?");
        double payment = input.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = input.nextDouble();

        double balance = 0;
        int years = 0;

        //update account balance while goal isn't reached
        while (balance < goal) {
            // add this year's payment and interest
            balance += payment;
            double interest = interestRate / 100 * balance;
            balance += interest;
            years++;
        }
        System.out.printf("You can retire in %d years." , years);
    }
}
