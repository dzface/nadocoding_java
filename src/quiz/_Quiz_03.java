package quiz;

/*
주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오
참고
주민등록번호는 13자리로 구성
앞 6자리는 생년월일 정보, 뒷7자리 중 첫번째 숫자는 성별 정보
입력데이터는 -을 포함한 14자리 문자열 형태
예시
"901231-1234567" 인 경우 901231-1 까지 출력


 */
public class _Quiz_03 {
    public static void main(String[] args) {
        String jumin = "970216-1234567";
        System.out.println(jumin.substring(0,8)); // 0위치부터 8직전까지
        System.out.println(jumin.substring(0, jumin.indexOf("-")+2)); // 0위치부터 - 이후 2자리 뒤까지
    }
}
