package chap_06;

// 전달값O, 반환값X 메서드
public class _02_Paramether {
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }
    public static void powerbyExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의" + exponent +" 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값(매개변수), Parameter
        // Argument, 인수
        power(2);
        powerbyExp(2,3); //2의 3승
    }
}
