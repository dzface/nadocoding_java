package chap_12.clean;

public class CleanThread extends Thread{
    public void CleanByStaff(){
        System.out.println("--직원 청소 시작 (other Thread)-- ");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("현재" +i +"번방 청소 중");

        }
        System.out.println("청소 완료");
    }
}
