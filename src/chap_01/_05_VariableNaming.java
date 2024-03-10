package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 (공백은 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상의 단어의 연속
        // 5. Camel type :소문자로 시작, 각 단어의 시작글자는 대문자 (첫단어는 반드시 소문자)
        // 6. 예약어 사용 불가 (public, ststic, void, int, double, float...)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAdress = "무슨호텔"; //체류지
        String purposeOfVist = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 항공 편명  변수명 밑줄 시작
        String fight_no = "KE657"; // 변수명 밑줄 삽입

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; //체류 기간
        String item1 = "시계";
        String item2 = "가방";

        // 프로그램의 흐름을 위해 사용 되는 경우 (이름이 크게 중요하지 않을 떄)
        int i = 0;
        String s = "";
        String str = "";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
