package chap_06;

public class _02_Paramether {
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값(매개변수), Parameter
        // Argument, 인수
        power(2);
    }
}
