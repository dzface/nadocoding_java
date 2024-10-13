package chap_12;

import java.util.ArrayList;

public class Barracks extends Thread{
    int number;
    public Barracks(int number){
        this.number = number;
    }
    public void run(){
        System.out.println(this.number + "번 배럭 마린 생산 시작");
        try{
            for (int i = 1; i <= 5 ; i++) {
                System.out.println(this.number +"번 배럭" + "마린 생산중 ....." + i + "/5");
                Thread.sleep(3000);
                System.out.println(this.number +"번 배럭" + "마린 생산완료 ....." + i + "/5");
            }

        } catch (Exception e) {
            System.out.println("오류 발생");
        }

        System.out.println(this.number  + "번 배럭 마린 생성 완료.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads =new ArrayList<>();
        for (int i = 1; i <4 ; i++) {
            Barracks b1 = new Barracks(i);
            b1.start();
            threads.add(b1);

        }
        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try{
                t.join();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("모든 생산 종료");

    }
}
