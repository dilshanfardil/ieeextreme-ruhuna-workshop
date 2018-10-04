package lk.avalanche.session;

import java.util.Scanner;

/**
 * DiagonalDifference is Created by Dishan on 10/4/2018
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        long sum1 = 0, sum2 = 0;
        t = in.nextInt();
        int[][] a = new int[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                a[i][j] = in.nextInt();
            }
            sum1 += a[i][i];
            sum2 += a[i][t - i - 1];
        }
        System.out.println(Math.abs(sum1 - sum2));
    }

}
