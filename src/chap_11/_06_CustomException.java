package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        int age = 17;
        try{
            if(age < 19) {
                System.out.println("if 문 로직:만 19세 미만에게는 판매하지 않습니다.");
                // 에러 발생시키기
                throw  new AgeLessThen19Exception("throw error 로직: 나이 판매 불가");
            } else {
                System.out.println("판매");
            }
            // 발생시킨 에러는 catch에서 처리함
        }catch(AgeLessThen19Exception e){
            System.out.println("catch error 로직 : 미성년자에게는 판매가 불가합니다.");
            e.printStackTrace();
        }
    }
}
class AgeLessThen19Exception extends Exception{
    public AgeLessThen19Exception(String message) {
        super(message);
    }
}
