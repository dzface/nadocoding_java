package chap_06;
// 전달값O 반환값O 메서드
public class _04_PrametherAndReturn {

    public static int getPower(int number){
        int result = number * number;
        return result; //return number * number;
    }
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=number;
        }
        return result;
    }
    public static void main(String[] args) {
        int returnVal = getPower(2); // 2의 제곱
        System.out.println(returnVal);

        returnVal = getPower(3);
        System.out.println(returnVal);
        //-----------------------------------

        int returnPow = getPowerByExp(2,8);
        System.out.println(returnPow);

    }
}
