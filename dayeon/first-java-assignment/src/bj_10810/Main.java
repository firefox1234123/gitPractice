package bj_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baskets = scanner.nextInt();
        int caseNum = scanner.nextInt();
        int[] basketArr = new int[baskets];

        for (int i = 0; i < caseNum; i++) {
            int range1 = scanner.nextInt();
            int range2 = scanner.nextInt();
            int ballNum = scanner.nextInt();

            for (int j = range1-1; j <= range2-1; j++) {
                basketArr[j] = ballNum;
            }
        }
        for (int i = 0; i < basketArr.length; i++) {
            System.out.print(basketArr[i]+" ");
        }
    }
}