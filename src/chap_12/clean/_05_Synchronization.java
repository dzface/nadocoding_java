package chap_12.clean;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();
        Runnable staff1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("--직원1 청소 시작 (Runnable)-- ");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(i==2) {
                        throw new RuntimeException("못해먹겠다!");
                    }

                }
                System.out.println("--직원1 청소 완료");
            }
        };
        Runnable staff2 = () -> {
            System.out.println("--직원2 청소 시작 (Runnable)-- ");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");
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
