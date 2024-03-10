package quiz;
/*
버스 도착정보를 출력하는 프로그램을 작성하시오.
각 정보는 적절한 자료형의 변수에 정의합니다.

정보
버스 번호는 "1234", "상암08"과 같은 형태
남은 시간은 분 단위 (예: 3분, 5분)
남은 거리는 km 단위 (예: 1.5km, 0.8km)
 */
public class _Quiz_01 {
    public static void main(String[] args) {
        String busNo = "99";
        int min = 15;
        float lastDistance = 2.0f;

        System.out.println(busNo + " 버스");
        System.out.println("약 " + min + "분 후 도착");
        System.out.println("남은 거리 "+ lastDistance + "km");
    }
}
