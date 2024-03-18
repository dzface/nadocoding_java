package quiz;

/*
개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오.
예)
입력부
나코딩
990130-1234567
010-1234-5678

출력부
나**
990130-1******
010-****-5678

조건
- 하나의 메소드에서 모든 동작 처리
각정보는 위처럼 비공개 적용

 */


public class _Quiz_06 {
    public static getHiddenData (String , int) {
        String name;
        String id;
        String phone;

    }
    public static void main(String[] args) {
        // 주어진 코드의 getHiddenData() 메소드를 완성하시오
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 :" + getHiddenData(name,1)); // 개인정보 비공개 시작위치
        System.out.println("주민등록번호 : "+getHiddenData(id,8));
        System.out.println("전화번호 : "+getHiddenData(phone,9));
    }
}
