package bj_11021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numA = 0, numB = 0, j = 0;

        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();

        int[] numArray = new int[caseNum * 2];

        for (int i = 0; i < caseNum * 2; i++) {
            numArray[i] = scanner.nextInt();
        }
        for (int i = 1; i <= caseNum; i++) {
            int addAB = numArray[j] + numArray[j + 1];
            System.out.printf("Case #%d: %d\n", i, addAB);
            j += 2;
        }
    }
}
