package chap_11;

public class _05_TryWIthResources {
    public static void main(String[] args) {
        MyfileWriter m1 = null;
        try{
            m1 = new MyfileWriter();
            m1.write("아이스크림이 먹고싶어요");
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                m1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("========== 구 분 선 ==================");
        try(MyfileWriter m2 = new MyfileWriter()) {
            m2.write("빵이 먹고싶어요");
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }
}

class MyfileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }
    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : "+ line);
    }
}
