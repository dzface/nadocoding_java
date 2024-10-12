package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17;
        try{
            if(age < 19) {
                System.out.println("만 19세 미만에게는 판매하하지 않습니다.");
                // 에러 발생시키기
                throw  new NullPointerException("널포인트 예외");
            } else {
                System.out.println("판매");
            }
            // 발생시킨 에러는 catch에서 처리함
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
