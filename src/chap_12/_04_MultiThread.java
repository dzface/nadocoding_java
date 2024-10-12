package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        Runnable staff1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("--직원1 청소 시작 (Runnable)-- ");
                for (int i = 1; i <= 10; i+=2) {
                    System.out.println("현재" +i +"번방 청소 중 (Runnable)");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("--직원1 청소 완료");
            }
        };
        Runnable staff2 = () -> {
            System.out.println("--직원2 청소 시작 (Runnable)-- ");
            for (int i = 2; i <= 10; i+=2) {
                System.out.println("현재" +i +"번방 청소 중 (Runnable)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("--직원2 청소 완료");
        };
        Thread staffThread1 = new Thread(staff1);
        Thread staffThread2 = new Thread(staff2);
        staffThread1.start();
        staffThread2.start();
    }
}
