package ch03;

import java.util.Arrays;

public class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //set interest rates to 10% ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }
        double[][] balances = new double[NYEARS][NRATES];

        //set initial balances to 10000
        Arrays.fill(balances[0], 10000);

        //compute interest for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                //get last year's balances from previous row
                double oldBalance = balances[i - 1][j];
                balances[i][j] = oldBalance * (1 + interestRate[j]);
            }
        }

        for (int i = 0; i < 60; i++) {
            System.out.printf("%s","-");
        }
//        System.out.printf("%n");
        System.out.println();

        //print one row of interest rates
        for (double v : interestRate) {
            System.out.printf("%9.0f%%", 100 * v);
        }
        System.out.println();

        for (int i = 0; i < 60; i++) {
            System.out.printf("%s","-");
        }
//        System.out.printf("%n");
        System.out.println();

        //print balance table
        for (double[] row : balances) {
            //print table row
            for (double b : row) {
                System.out.printf("%,10.2f",b);
            }
            System.out.println();
        }

        for (int i = 0; i < 60; i++) {
            System.out.printf("%s","-");
        }
//        System.out.printf("%n");
        System.out.println();
    }
}
