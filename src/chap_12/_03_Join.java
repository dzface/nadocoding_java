package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
        try {
            // 2.5초 동안 기다린 뒤에도 thread 가 동작중이면 아래코드 동작
            thread.join(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cleanByBoss();
    }
    public static void cleanByBoss(){
        System.out.println("--혼자서 청소 시작 -- ");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("현재" +i +"번방 청소 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("청소 완료");
    }


}
