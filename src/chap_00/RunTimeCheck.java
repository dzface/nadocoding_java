package chap_00;

import java.util.ArrayList;
import java.util.Arrays;

public class RunTimeCheck {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        long startTime = System.nanoTime(); // 코드 시작시간
        for (int i = 0; i < 10000; i++) {
            list.add(i);
            System.out.println(list.get(i));
        }
        long endTime = System.nanoTime();
        long runningTime = endTime - startTime;
        System.out.println("실행시간 : " + runningTime + "n/s");
        System.out.println("실행시간 : " + (runningTime/1000000000) + "sec");
    }
}
