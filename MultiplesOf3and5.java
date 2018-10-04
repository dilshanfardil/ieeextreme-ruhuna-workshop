package lk.avalanche.session;

import java.util.Scanner;

/**
 * MultiplesOf3and5 is Created by Dishan on 10/4/2018
 */
public class MultiplesOf3and5 {

    static long s(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            long N = input.nextInt();
            N -= 1;
            System.out.println(s(N / 3) * 3 + s(N / 5) * 5 - s(N / 15) * 15);
        }
    }

}
