package chap_12;

import chap_12.clean.CustomThread;

public class _02_Runnable {
    public static void main(String[] args) {
        CustomThread c1 = new CustomThread();
        Thread thread = new Thread(c1);
        thread.start();
        cleanByBoss();
    }
    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <=10 ; i+=2) {
            System.out.println("사장 " +i+ "번 방 청소 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("사장 청소 끝 !");
    }
}
