package chap_12;

import chap_12.clean.StaffThread;

public class _01_Thread {
    public static void main(String[] args) {


        StaffThread s1 = new StaffThread();
        s1.start();
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
