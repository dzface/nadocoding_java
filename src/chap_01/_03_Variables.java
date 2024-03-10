package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; // name 이라는 문자열 선연
        name = "나도코딩";
        int hour = 15; // 정수 자료형 선언과 동시에 변수를 등록 할 수 있음.

        System.out.println( name + "님, 배송이 시작됩니다. "+ 15 + " 시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");
        double score = 90.5; //  실수 자료형 변수 선언
        char grade = 'A'; // 문자 자료형 변수 선언
        name = "강백호"; // name 이라는 자료형 변수 업데이트
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 "+ grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        //실수를 표현하는 두가지 방법
        double d = 3.1415926535;
        float f = 3.1415926535F; //float 은 숫자 뒤에 F또는 f가 있어야함
        System.out.println(d);
        System.out.println(f); // float은 실수의 소숫점 7개까지만 표현

//        int n = 10000000000;
        long l= 10000000000L; //정수의 자릿수가 큰 변수는 long 자료형 사용
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
