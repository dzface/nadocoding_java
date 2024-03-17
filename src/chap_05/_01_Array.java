package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        // String[] coffees1 = new String[4];

        // 두 번째 방법
        // String coffees2[] = new String[4];

//        coffees[0] = "아메리카노"; // 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 세 번째 방법
        String[] coffees3 = new String[] {"아메리카노","카페모카","라떼","카푸치노"};
        String[] coffees4 = {"아메리카노","카페모카","라떼","카푸치노"};

        System.out.println("---------------------------------");

        //커피주문
        System.out.println(coffees4[0] + "하나"); //아메리카노 하나
        System.out.println(coffees4[1]+ "하나");
        coffees4[2] = "사과주스";
        System.out.println(coffees4[2]+"하나");
        System.out.println(coffees4[3]+"하나");
        System.out.println("주세요");



    }
}
