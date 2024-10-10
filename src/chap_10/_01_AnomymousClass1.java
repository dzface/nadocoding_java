package chap_10;

public class _01_AnomymousClass1 {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        Coffee specialCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("귓속말: 딸케는 서비스");
            }
        };
        specialCoffee.order("라떼");
    }
}

class Coffee {

    public void order(String coffee) {
        System.out.println("주문하신 " +coffee + "나왔습니다.");
    }
}