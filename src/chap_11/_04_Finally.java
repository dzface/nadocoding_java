package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try{
            System.out.println("냉장고 문열기");
            //throw new Exception("냉장고에 아무 것도 없다!");
            System.out.println("재료꺼내기");
        }catch (Exception e){
            System.out.println("문제 발생 : " + e.getMessage());
        }finally {
            System.out.println("냉장고 문 닫기");
        }
    }
}
