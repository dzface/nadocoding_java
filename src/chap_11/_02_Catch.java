package chap_11;

public class _02_Catch {
    public static void main(String[] args) {

        try{
            Object obj = null;
            System.out.println(obj.hashCode());
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            // 여러 에러를 한번에 처리 할때
        } catch (ClassCastException | ClassFormatError e) {
            e.printStackTrace();
            // Exception : 모든 에러를 포함하는 클래스
        } catch (NullPointerException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
