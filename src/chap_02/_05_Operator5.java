package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자

        // 결과 = 조건 ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;

        int max = (x>y) ? x : y; // x 가 y보다 크면 max에 5 선언
        System.out.println(max);

        String s = (x != y) ? "달라요" : "같아요"; // x와 y가 다르면 s에 "달라요" 선언
    }
}
