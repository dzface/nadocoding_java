package quiz;


import quiz.quiz12.StaffThread;

public class _Quiz_12 {
    //요구 조건 A와B가 상품을 각각 5개씩 준비 완료된 이후에
    //세트 포장 5개 준비하기
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i <=5 ; i++) {
                System.out.println("A상품 준비 "+i+ "/5");
            }
            System.out.println("--- A 상품 준비 완료 ---");
        };
        Runnable runnableB = () -> {
            for (int i = 1; i <=5 ; i++) {
                System.out.println("B상품 준비 "+i+ "/5");
            }
            System.out.println("--- B 상품 준비 완료 ---");
        };
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        threadA.start();
        threadB.start();

//        try {
//            threadA.join();
//            threadB.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        // 동기 방법에는 .isAlive()도 가능
        while(threadA.isAlive() || threadB.isAlive()){}

        Runnable runnableSet = ()-> {
            System.out.println("==== 세트상품 포장 시작 ====");
            for (int i = 1; i <=5 ; i++) {
                System.out.println("세트 상품 준비 "+ i + "/5");

            };
            System.out.println("==== 세트 상품 준비 완료 ====");
        };
        Thread threadSet = new Thread(runnableSet);
        threadSet.start();

    }


}
