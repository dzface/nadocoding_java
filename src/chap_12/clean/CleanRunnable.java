package chap_12.clean;

import java.sql.Time;

public class CleanRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("--직원 청소 시작 (Runnable)-- ");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("현재" +i +"번방 청소 중 (Runnable)");
        }
        System.out.println("청소 완료");
    }
}
