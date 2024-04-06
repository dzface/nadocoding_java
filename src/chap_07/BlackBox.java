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
    //showDateTime: 날짜정보 표시여부
    //showSpeed : 속도 정보 표시여부
    // min : 영상 기록 단위 (분)

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed){
            System.out.println("영상정보가 표시됩니다. ");

        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }
    void record(){ // record 메서드를 오보러딩하고 디폴트 값을 설정해줌
        record(true,true,5);
    }


}
