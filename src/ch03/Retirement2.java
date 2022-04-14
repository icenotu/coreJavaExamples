package ch03;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        // read input
        Scanner input = new Scanner(System.in);

        System.out.println("How much money will you contribute every year?");
        double payment = input.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = input.nextDouble();

        double balance = 0;
        int year = 0;

        String in;
        //update account balance while user isn't ready to retire
        do {
            // add this year's payment and interest
            balance += payment;
            double interest = interestRate / 100 * balance;
            balance += interest;
            year++;

            //print current balance
            System.out.printf("After year %d, your blance is %,.2f%n", year, balance);

            //ask if ready to retire and get input
            System.out.println("Ready to retire? (Y/N) ");
            in = input.next();
            /*
            nextLine（）自动读取了被next（）去掉的Enter作为他的结束符，所以没办法从键盘输入值。
            经过验证，其他的next的方法，如nextDouble()  ，nextFloat() ，nextInt() 等与nextLine（）连用时都存在这个问题。
             */
//            input.nextLine();
//            in = input.nextLine();
//            System.out.println("N".equalsIgnoreCase(in));
        } while ("N".equalsIgnoreCase(in));
    }
}
