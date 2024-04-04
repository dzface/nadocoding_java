package chap_07;
//인스턴스변수
public class _02_InstanceVariable {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox(); //BlackBox 클래스로 부터 b1이라는 객체(인스턴스)생성
        b1.modelName = "까망이";
        b1.resolution ="FHD";
        b1.price = 200000;
        b1.color = "블랙";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        //새로운 블랙박스 제품
        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.resolution = "FHD";
        b2.price = 250000;
        b2.color = "화이트";
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
        // 이것도 불편하다...

    }
}
