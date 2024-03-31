package bj_9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int caseNum = scanner.nextInt();
        String[] strArray = new String[caseNum+1];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scanner.nextLine();
        }
        for (int i = 1; i < strArray.length; i++) {
            System.out.print(strArray[i].charAt(0));
            System.out.println(strArray[i].charAt((strArray[i].length()-1)));
        }
    }
}
