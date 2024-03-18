package chap_06;

public class _07_VariableScope {

    public static void methodA(int number){ // 메인영역에 선언된 지역변수를 메소드에 사용하려면 int number를 입력해야함

    }
    public static void methodB(){
        int result = 1; //지역변수 methodB 영역 내에서만 사용가능한 변수 메인영역에서 result로만 사용 불가
    }
    public static void main(String[] args) {
        int number = 3; //
        for (int i = 0; i < 2; i++) {

        }
//        System.out.println(i); for문의 i는 {}범위 밖에서는 사용 불가

    }
}
