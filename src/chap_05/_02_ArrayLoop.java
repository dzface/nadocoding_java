package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {

        String[] coffees4 = {"아메리카노","카페모카","라떼","카푸치노"};


        System.out.println("--------------방법 1------------");

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees4[i] + "하나");
        }
        System.out.println("주세요.");
        System.out.println("--------------방법 2------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees4.length; i++) {
            System.out.println(coffees4[i] + "하나");
        }
        System.out.println("주세요.");

        System.out.println("--------------방법 3------------");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees4) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요.");

    }
}
