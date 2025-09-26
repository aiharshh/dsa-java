package zcodeForces;

import java.util.Scanner;

public class bePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int zeros = 0;
            int countOfMinusOne = 0;
            int minOps = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) zeros++;
                else if (arr[i] == -1) countOfMinusOne++;
            }
            minOps = zeros;
            if (countOfMinusOne % 2 != 0) {
                minOps += 2;
            }
            System.out.println(minOps);
        }
    }
}
