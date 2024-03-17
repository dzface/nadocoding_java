package quiz;

import java.util.Scanner;

/*
주차요금은 시간당 4000원 (일일 최대요금은 30000원)
경차 또는 장애인 차량은 최종요금에서 50% 할인
예시
일반차량 5시간 20000원
경차 5시간 주차시 10000원
장애인 차량 10시간 주차시 15000원
 */
public class _Quiz_04 {
    public static void main(String[] args) {
        int hour;
        float total = 0;
        String dc = null;
        String y=null;
        String n = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("주차시간을 입력하세요. :");
        hour = sc.nextInt();
        System.out.println("경차나 장애인 동승자가 있습니까? (y/n) :");
        dc = sc.next();
         // 주차시간
        int fee = hour * 4000;// 시간당 4000원
        // 3만원 초과 시 일일 최대 요금 3만원
        if (fee > 30000) fee = 30000;

        // 경차 또는 장애인 차량인 경우 50% 할인
        if(dc == y) {
            total = fee * 0.5f; // fee /=2; 도 가능
        } else total = fee;
        //실행 결과 출력
        System.out.println("총 주차 요금은 "+(int)total+"원 입니다.");
    }
}
