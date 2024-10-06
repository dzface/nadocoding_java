package chap_00;

public class SHBank implements InterfaceStudy{
    public void withDraw(int price){
        System.out.println("SH은행 전용 인출로직");
        if(price < SHBank.MAX_INTEGER){
            System.out.println(price+" 원을 인출합니다.");
        }else System.out.println(price+" 원 인출 실패");
    }
    public void deposit(int money){ //파라미터 명 한번 바꿔봄
        System.out.println("SH은행 전용 입금로직");
        System.out.println(money+" 원 입금.");
    }
}
