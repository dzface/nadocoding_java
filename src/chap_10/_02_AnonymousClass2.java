package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("--------------");
        HomeMadeBurger broMadeBurger = getBroMadeBurger();

    }
    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 치즈, 양상추, 마요네즈, 피클");
            }
        };
    }
    public static HomeMadeBurger getBroMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {

            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract  void cook();
}
///

///



