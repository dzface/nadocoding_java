package chap_12;

import chap_12.clean.CustomThread;

public class _03_Join {
    public static void main(String[] args) {
        CustomThread c1 = new CustomThread();
        Thread thread = new Thread(c1);
        thread.start();
        try {
            thread.join(3000); // 3초 후에도 종료되지 않으면 다끝내지 않고 그냥 pass
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
