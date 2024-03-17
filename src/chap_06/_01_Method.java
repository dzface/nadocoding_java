package chap_06;

// 전달값 X 반환값X 메서드
public class _01_Method {
    public static void sayHello(){
        System.out.println("안녕하세요? 메소드 입니다.");
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }

}
