package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        CleanThread cleanThread = new CleanThread();
        cleanThread.start();
        cleanByBoss();
    }
    //호텔방 청소한다고 가정
    // 방 호실 1 3 5 7 9
    // 복도
    // 방 호실 2 4 6 8 10
    public static void cleanByBoss(){
        System.out.println("--혼자서 청소 시작 -- ");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("현재" +i +"번방 청소 중");

        }
        System.out.println("청소 완료");
    }



}
