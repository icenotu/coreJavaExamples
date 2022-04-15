package ch03;

import java.util.Scanner;

/**
 * 这是一个递归版本的lotteryOdds
 */

public class LotteryOdds2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.print("What's the highest number you can draw?");
        int n = in.nextInt();



        int lotteryOdds = getOdds(n, k);
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

    }

    /*
     *compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
     */
    private static int getOdds(int n, int k){
        int odds = 1;
        if (k == 1) {
            return n;
        }
        return getOdds(n-1, k-1)* n/k;
    }
}
