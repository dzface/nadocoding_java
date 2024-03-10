package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        int score = 93;
        System.out.println(score);
        System.out.println((float) score); // (자료형) 변수명
        System.out.println((double) score);

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93+98
        System.out.println(score); // 191

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 >> 191.0 정수형 변수를 입력하면 자동으로 실수형 자료형으로 변환되어 적용 됨
        // int >> long >> float >> double (자동 형변환)

        // int convertedScoreInt = score_d; // 191.8 >> 191 실수형 변수명을 int에 선언할 경우 오류 발생 (int)로 형변환후 입력 할 것.

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // 정수 93이 문자열 93으로 변경
        s1 = Integer.toString(93); // 정수 93을 문자열로 바꾸는 방법2

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // (int)93
        double d = Double.parseDouble(("98.8"));


    }
}
