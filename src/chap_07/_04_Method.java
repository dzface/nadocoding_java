package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1= new BlackBox();
        b1.modelName ="까망이";

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨
        b1.insertMemoryCard(256);

        // 블랙박스 상황별 영상 분류하여 영상수 호출메서드 가정
        //일반영상 :1
        //이벤트 영상 (충돌감지) :2
        int fileCount = b1.getVideoFileCount(1);// 1: 일반 영상
        System.out.println("일반영상 수는 " +fileCount+ "개 입니다.");

        int fileCount2 = b1.getVideoFileCount(2);// 2: 이벤트 영상
        System.out.println("충돌감지영상 수는 " +fileCount+ "개 입니다.");

    }
}
