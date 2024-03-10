package chap_01;


// 이미 정해져있거나 변하면 안되는 데이터 입력시 상수로 적용하여 사용
// 상수는 모두 대문자로 표기하고 snake tpye으로 상수명 작성
public class _06_constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; // final로 상수처리 국가 번호
        // KR_COUNTRY_CODE = "+8282"; 상수처리한 데이터는 수정하려하면 오류 발생
        System.out.println(KR_COUNTRY_CODE);

        final double FI = 3.141592; // 원주율 상수 처리
        final String DATE_OF_BIRTH = "20001-12-31"; // 생년 월일

    }
}
