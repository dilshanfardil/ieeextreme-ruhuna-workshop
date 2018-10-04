package lk.avalanche.session;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * LatticePaths is Created by Dishan on 10/4/2018
 */
public class LatticePaths {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int number = 0;
        long m, n;
        while (count-- > 0) {
            m = input.nextLong();
            n = input.nextLong();

            System.out.println((m(m+n).divide(m(m).multiply(m(n)))).mod(BigInteger.valueOf(1000000007)));

        }


    }

    static BigInteger m(long limt){
        BigInteger x = new BigInteger("1");
        for (long i = 1; i <= limt; i++) {
            x = x.multiply(BigInteger.valueOf(i));
        }
        return x;
    }

}
