package chap_06;
// Overloading : 이름이 같은 메서드를 여러개 만드는 것?
public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result; //return number * number;
    }
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);//문자열 자료형을 입력받아 인수형으로 변환
        return number * number;
    }
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메서드 오버로딩
        // 같은 이름의 메소드를 여러번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        // 3. 반환형의 타입은 동일해야 함
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3,3));
    }
}
