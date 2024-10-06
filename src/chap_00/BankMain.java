package chap_00;

public class BankMain {
    public static void main(String[] args) {
        InterfaceStudy bank = new KBBank();
        bank.withDraw(100);
        bank.deposit(100);
        bank.findDormanctAccount("763231");
        InterfaceStudy.BCAuth("KBBank");

        System.out.println("============인스턴스 교체==============");

        bank = new SHBank();
        bank.withDraw(100);
        bank.deposit(100);
        bank.findDormanctAccount("4311");
        InterfaceStudy.BCAuth("SHBank");

        System.out.println("============대학교 주은행 교체==============");
        bank = new KBBank();
        bank.withDraw(20000);
        bank.deposit(1000);
        bank.findDormanctAccount("855512");
        InterfaceStudy.BCAuth("SHBank");


    }

}
