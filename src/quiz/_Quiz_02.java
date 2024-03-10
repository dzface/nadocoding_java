package quiz;

import java.util.Scanner;

/*
어린이 키에 따른 놀이기구 탑승 가능 여부를
확인하는 프로그램을 작성하시오.

== 조건 ==
키가 120cm 이상인 경우에만 탑승 가능
삼항 연산자 이용
== 출력 ==
키가 115cm 이므로 탑승 불가능 합니다.
키가 121cm 이므로 탑승 가능 합니다.

 */
public class _Quiz_02 {
    public static void main(String[] args) {
        int h = 110;

        String r = (h >= 120 ) ? ("키가" + h +"cm 이므로 탑승 가능합니다.") : ("키가" + h +"cm 이므로 탑승 불가능합니다.");
        System.out.println(r);
    }
}
