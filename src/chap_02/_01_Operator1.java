package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자
        //일반 연산
        System.out.println(4+2); // 6
        System.out.println(4 -2); // 2
        System.out.println(4*2); // 8
        System.out.println(4/2); // 2
        System.out.println(5/2); // 2 정수 값이 나옴
        System.out.println(2/4); // 0 정수 값이 나옴
        System.out.println(4%2); // 0 나머지 연산
        System.out.println(5%2); // 1

        // 우선순위 연산
        System.out.println( 2+2*2); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        System.out.println(a + b);

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11
        val = 10;
        System.out.println(val); //10
        System.out.println(--val); // 9
        System.out.println(val--); // val 호출 후 -1 이므로 9로 나타남
        System.out.println(val); // 8

    }
}
