package ch05;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());

    }

    enum Size {
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
        Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }
        public String getAbbreviation(){
            return abbreviation;
        }
        private String abbreviation;
    }
}
