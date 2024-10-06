package chap_00;

public class KBBank implements InterfaceStudy{
    @Override
    public void withDraw(int price){
        System.out.println("KB은행 전용 인출로직");
        if(price < KBBank.MAX_INTEGER){
            System.out.println(price+" 원을 인출한다.");
        }else System.out.println(price+" 원 인출 실패.");
    }

    public void deposit(int price){
        System.out.println("KB은행 전용 입금 로직");
        System.out.println(price+ " 원을 입금한다.");
    }

    @Override
    public String findDormanctAccount(String custID) {
        System.out.println("휴면계좌 찾기 기능실행");
        return InterfaceStudy.super.findDormanctAccount(custID);
    }



}
