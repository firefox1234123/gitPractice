package bj_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        //기존 알고리즘
        /*if (hour == 0) {
            hour = 23;
        } else {
            hour -=1;
        }
        min -= 45;
        if (min < 0) {
            min += 60;
        }*/
        //분이 아닌 시간을 기준으로 먼저 맞춘 후에,
        //분에서 45를 빼고, 음수라면 60을 더해 시간을 맞추었습니다
        //하지만 기존 알고리즘은 0시 45분~59분일 때 23시 0~14분이 되는 오류가 발생하였으나,
        //문제 풀이 당시에는 오류를 찾지 못 해 6~7번을 틀린 후에 검색하여 참고하였습니다
        //출처 : https://st-lab.tistory.com/24 중 방법 1

        if (min < 45) { //시간이 아닌 분을 기준으로, 45분보다 큰지 작은지를 판단하는 것이 문제의 중점이었습니다
            hour -= 1; //따라서 분이 45보다 작다면 시간을 1시간 줄이고,
            min = 60 - (45 - min); //복잡한 방법 대신, 45분에서 분을 뺀 후 차액을 다시 60에서 빼는 식으로 계산합니다.
            if (hour < 0) { //1시간 줄인 시간이 0보다 작다면 23시간이 되도록 합니다.
                hour = 23;
            }
        } else { //분이 45분보다 크다면 45를 뺍니다.
            min -= 45;
        }
            System.out.println(hour+" "+min);
    }
}
