package chap_07;

public class BlackBox {
    String modelName; //모델명
    String resolution; //해상도
    int price; // 가격
    String color; // 색상
    static boolean canAutoReport = false; // 자동신고 기능 여부

    //메소드 생성
    void autoReport (){
        if (canAutoReport) { // true 면 if 문 실행
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else { // false 면 else문 실행
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
        // 메모리카드 정보 호출 메소드 가정
    }
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입 되었습니다.");
        System.out.println("용량은 "+capacity + "Gb 입니다.");
    }

    int getVideoFileCount(int type) {
        if(type ==1 ) { // 일반영상
            return 9;
        }
        else if (type ==2){
            return 1;
        }
        return 10;
    }


}
