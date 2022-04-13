package ch03;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //获取第一个输入值
        System.out.print("What's your name? ");
        String name = input.nextLine();
        //获取第二个输入值
        System.out.print("How old are you? ");
        int age = input.nextInt();
        //显示结果
        System.out.printf("Hello, %s. Next year, you'll be %d", name, age + 1);
    }
}
