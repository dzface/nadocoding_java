package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // false 대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); // true 대소문자 구분안함

        // 문자열 비교 심화

        s1 = "1234"; // 현관에 붙은 메모지의 비밀번호 정보를 참조
        s2 = "1234"; // 주방에 붙은 비밀번호 정보

        System.out.println(s1.equals(s2)); // true 실제 변수를 비교
        System.out.println(s1 == s2); //true 위치를 참조

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false ***값을 비교하는 것이 아닌 위치를 반환하기 때문에

    }
}
