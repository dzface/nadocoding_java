package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);


        System.out.println(s.length()); //29 문자열의 길이 확인
        System.out.println(s.toUpperCase()); // 대문자로 변환
        System.out.println(s.toLowerCase()); // 소문자로 변환

        // 포함관계 외부 데이터를 판단 할 때
        System.out.println(s.contains("Java")); // 포함된다면 true, 아니면 false
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 첫 위치정보 확인 0부터 시작
        System.out.println(s.indexOf("C#")); // 포함되지 않으면 -1 반환
        System.out.println(s.lastIndexOf("and")); // and의 마지막 위치 정보 반환
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith(".")); // 이문자열로 끝나면 true




    }
}
