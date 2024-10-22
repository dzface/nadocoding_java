package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        Room room = new Room();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작");
                for (int i = 1; i <=5 ; i++) {
                    room.clean("직원1");
                    // 직원 1이 청소하다 탈주하는 코드 작성
                    // 직원 1이 중단해도 직원 2는 작업 계속 진행
                    if(i ==2 ){
                        try {
                            throw new Exception("힘들어서 귀가하겠습니다.");
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                }


                System.out.println("직원1 청소 끝!");
            }
        };
        // 람다식으로 코드 작성
        Runnable r2 = () -> {
            System.out.println("직원2 청소 시작");
            for (int i = 1; i <=5 ; i++) {
                room.clean("직원2");
            }
            System.out.println("직원2 청소 끝!");
        };
        Thread c1 = new Thread(r1);
        Thread c2 = new Thread(r2);
        c1.start();
        c2.start();
    }

}
