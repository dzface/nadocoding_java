package chap_00;
//상수: 값이 정해져 있고 변경불가
//타입 상수명(대문자) = 값;

//추상 메소드:강제 구현의무가 있고 오버라이팅해서 재구현
//타입 메소드명(매개변수,...);

//디폴트 메소드:기본적으로 제공해주지만 구현방법과 구현여부가 선택적
//default 타입 메소드명(매개변수,..){
//        구현부}

// 정적메소드 인터페이스에서 제공해주는 것으로 무조건 사용(절대적)
//static 타입 메소드명(매개변수){
// 구현부}

//은행 입금, 인출, 휴면계좌조회, 블록체인인증 기능 예제
public interface InterfaceStudy {

    // 상수(하루에 고객에게 인출해 줄 수 있는 금액 명시)
    public int MAX_INTEGER = 10000000;

    //추상메소드(인출하는 메소드)
    void withDraw(int price);

    //추상메소드(입금하는 메소드)
    void deposit(int price);

    //JAVA8에서 가능한 default 메소드(고객의 휴면계좌 찾아주는 메소드 :필수구현은 선택사항)
    //단 구현하려면 따라야함
    default String findDormanctAccount(String custID){
        System.out.println("**금융개정법안 00개정 고객의 휴면계좌 찾기기능 입니다.**");
        System.out.println("**금융결제원에서 제공하는 로직**");
        return "00은행 000-000-0000-00";
    }

    //JAVA8에서 가능한 정적 메소드 (블록체인 인증을 요청하는 메소드)
    static void BCAuth(String bankName){
        System.out.println(bankName+" 에서 블록체인 인증을 요청합니다.");
        System.out.println("전 금융사 공통 블록체인 로직 수행");
    }
}
