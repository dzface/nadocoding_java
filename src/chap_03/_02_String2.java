package chap_03;

public class _02_String2 {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); //" and"를 ",","로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7번째 부터 시작
        System.out.println(s.substring(s.indexOf("Java"))); // Java라는 문자를 찾아 위치를 반환한다음 그 위치부터 출력
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // 시작은 위치를 포함하고, 끝은 제외하고 출력

        // 공백제거
        s= "         I love Java   ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거
        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); //JavaPython
        System.out.println(s1 + ","+ s2); //Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python

    }
}
