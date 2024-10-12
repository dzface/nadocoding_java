package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        //에러종류
        //ㄴ 컴파일 오류 : 오타, 문법오류
        //ㄴ 런타임 오류
        //   ㄴ error : stackoverflow
        //   ㄴ exception
        try{
            //System.out.println(3/0);

//            int[] arr =new int[3];
//            arr[5] = 100;

            Object obj = "text";
            System.out.println((int) obj);
        }catch (Exception e){
            System.out.println("error message : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
