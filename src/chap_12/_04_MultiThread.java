package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {

        //Runnable은 인터페이스인데 객체를 생성하는게 이해 안되서
        //ChatGPT한테 물어보니까 내부적으로 익명클래스가 인스턴스를 만들고 r1변수에 할당 한다고 함
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("직원1 청소 시작");
                for (int i = 1; i <=10 ; i+=2) {
                    System.out.println("직원1 " +i+ "번 방 청소 중");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("직원1 청소 끝!");
            }
        };
        // 람다식으로 코드 작성
        Runnable r2 = () -> {
            System.out.println("직원2 청소 시작");
            for (int i = 2; i <=10 ; i+=2) {
                System.out.println("직원2 " +i+ "번 방 청소 중");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("직원2 청소 끝!");
        };
        Thread c1 = new Thread(r1);
        Thread c2 = new Thread(r2);
        c1.start();
        c2.start();
    }
}
