import java.math.BigInteger;
import java.util.Scanner;


public class Odds {
    public static void main(String[] args) {

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        BigInteger lotteryOdds1 = BigInteger.valueOf(1);

        for (int i = 1; i <= 6; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(49 - i + 1)).divide(
                    BigInteger.valueOf(i));

        for (int i = 1; i <= 5; i++)
            lotteryOdds1 = lotteryOdds1.multiply(BigInteger.valueOf(40 - i + 1)).divide(
                BigInteger.valueOf(i));

        System.out.println("Odds of winning the lottery(6/49) are 1 in " + lotteryOdds);
        System.out.println("Odds of winning the lottery(5/40) are 1 in " + lotteryOdds1);
    }
}
